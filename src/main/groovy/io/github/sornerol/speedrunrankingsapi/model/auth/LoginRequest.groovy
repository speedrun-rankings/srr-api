package io.github.sornerol.speedrunrankingsapi.model.auth

import groovy.transform.CompileStatic

@CompileStatic
class LoginRequest {
    String username
    String password
    String recaptchaToken
}
