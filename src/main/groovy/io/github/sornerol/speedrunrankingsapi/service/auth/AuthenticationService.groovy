package io.github.sornerol.speedrunrankingsapi.service.auth

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.github.sornerol.speedrunrankingsapi.model.SrrUser
import io.github.sornerol.speedrunrankingsapi.model.auth.LoginRequest
import io.github.sornerol.speedrunrankingsapi.model.auth.LoginResponse
import io.github.sornerol.speedrunrankingsapi.service.JwtUserDetailsService
import io.github.sornerol.speedrunrankingsapi.service.SrrUserService
import io.github.sornerol.speedrunrankingsapi.util.TokenManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.authentication.DisabledException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service

@CompileStatic
@Service
@Slf4j
class AuthenticationService {

    private JwtUserDetailsService userDetailsService
    private AuthenticationManager authenticationManager
    private TokenManager tokenManager
    private SrrUserService userService

    @Autowired
    AuthenticationService(JwtUserDetailsService userDetailsService,
                          AuthenticationManager authenticationManager,
                          TokenManager tokenManager,
                          SrrUserService userService) {
        this.userDetailsService = userDetailsService
        this.authenticationManager = authenticationManager
        this.tokenManager = tokenManager
        this.userService = userService
    }

    ResponseEntity authenticateWebUser(LoginRequest loginRequest) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.username, loginRequest.password))
        } catch (DisabledException e) {
            log.error("User ${loginRequest.username} is disabled")
            throw e
        } catch (BadCredentialsException e) {
            log.error("Bad credentials for user ${loginRequest.username}")
            throw e
        } catch (any) {
            log.error("${any.message}", any)
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.username)
        String jwtToken = tokenManager.generateJwtToken(userDetails)
        SrrUser user = userService.getUserByUsername(loginRequest.username)
        ResponseEntity.ok(new LoginResponse(jwtToken, user))
    }

}