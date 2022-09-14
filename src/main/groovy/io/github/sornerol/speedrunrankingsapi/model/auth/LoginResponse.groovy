package io.github.sornerol.speedrunrankingsapi.model.auth

import groovy.transform.CompileStatic
import io.github.sornerol.speedrunrankingsapi.model.SrrUser

@CompileStatic
class LoginResponse {
    String accessToken
    String refreshToken
    SrrUser user

    LoginResponse(String accessToken, String refreshToken, SrrUser user) {
        this.accessToken = accessToken
        this.refreshToken = refreshToken
        this.user = user
    }
}
