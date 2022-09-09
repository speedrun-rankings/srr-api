package io.github.sornerol.speedrunrankingsapi.model

import com.fasterxml.jackson.annotation.JsonIgnore

class SrrUser {
    UUID id
    String username
    @JsonIgnore String password
    String email
    Boolean enabled
    List<String> siteRoles
    List<String> additionalPermissions
}
