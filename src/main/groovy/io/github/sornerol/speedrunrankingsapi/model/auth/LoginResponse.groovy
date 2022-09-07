package io.github.sornerol.speedrunrankingsapi.model.auth

import groovy.transform.CompileStatic
import io.github.sornerol.speedrunrankingsapi.model.SrrUser

@CompileStatic
class LoginResponse {
    String jwtToken
    SrrUser user

    LoginResponse(String jwtToken, SrrUser user) {
        this.jwtToken = jwtToken
        this.user = user
    }
}
