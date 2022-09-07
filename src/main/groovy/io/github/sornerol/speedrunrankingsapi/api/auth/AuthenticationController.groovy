package io.github.sornerol.speedrunrankingsapi.api.auth

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.github.sornerol.speedrunrankingsapi.model.auth.LoginRequest
import io.github.sornerol.speedrunrankingsapi.service.auth.AuthenticationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ['/api/auth'])
@CrossOrigin
@CompileStatic
@Slf4j
class AuthenticationController {

    AuthenticationService authenticationService

    AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService
    }

    @PostMapping('/login')
    ResponseEntity webUserLogin(@RequestBody LoginRequest loginRequest) {
        authenticationService.authenticateWebUser(loginRequest)
    }


}
