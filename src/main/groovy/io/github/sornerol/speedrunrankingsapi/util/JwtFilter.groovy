package io.github.sornerol.speedrunrankingsapi.util

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.github.sornerol.speedrunrankingsapi.service.JwtUserDetailsService
import io.jsonwebtoken.ExpiredJwtException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter

import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Slf4j
@Component
@CompileStatic
class JwtFilter extends OncePerRequestFilter {

    private JwtUserDetailsService userDetailsService
    private TokenManager tokenManager

    @Autowired
    JwtFilter(JwtUserDetailsService userDetailsService,
              TokenManager tokenManager) {
        this.userDetailsService = userDetailsService
        this.tokenManager = tokenManager
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String tokenHeader = request.getHeader('Authorization')
        String username = null
        String token = null
        if (tokenHeader != null && tokenHeader.startsWith('Bearer ')) {
            token = tokenHeader.substring(7)
            try {
                username = tokenManager.getUsernameFromToken(token)
            } catch (IllegalArgumentException ignored) {
                log.error('Unable to get JWT Token')
            } catch (ExpiredJwtException ignored) {
                log.error('JWT Token has expired')
            }
        } else {
            log.warn('Bearer String not found in token')
        }
        if (username && SecurityContextHolder.context.authentication == null) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username)
            if (tokenManager.validateJwtToken(token, userDetails)) {
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,
                        null,
                        userDetails.authorities)
                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request))
                SecurityContextHolder.getContext().setAuthentication(authenticationToken)
            }
        }
        filterChain.doFilter(request, response)
    }
}
