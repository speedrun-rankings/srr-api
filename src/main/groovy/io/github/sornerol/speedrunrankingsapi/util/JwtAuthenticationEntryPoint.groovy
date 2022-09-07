package io.github.sornerol.speedrunrankingsapi.util

import groovy.transform.CompileStatic
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.stereotype.Component

import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@CompileStatic
@Component
class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    public static final long serialVersionUID = 2050306758283929277L

    @Override
    void commence(HttpServletRequest request,
                  HttpServletResponse response,
                  AuthenticationException authException) throws IOException, ServletException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, 'Unauthorized')
    }
}
