package io.github.sornerol.speedrunrankingsapi.model

import com.fasterxml.jackson.annotation.JsonIgnore
import io.github.sornerol.speedrunrankingsapi.enums.SiteRole

class SrrUser {
    UUID id
    String username
    @JsonIgnore String password
    String email
    Boolean enabled
    SiteRole siteRole
    List<UUID> moderatedGames
    List<UUID> moderatedSeries
    List<UUID> ownedGames
    List<UUID> ownedSeries
}
