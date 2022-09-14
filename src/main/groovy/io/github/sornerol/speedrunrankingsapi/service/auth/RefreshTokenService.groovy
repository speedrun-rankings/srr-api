package io.github.sornerol.speedrunrankingsapi.service.auth

interface RefreshTokenService {
    boolean verifyTokenForUser(String token, UUID userId)
    String generateTokenForUser(UUID userId)
    void invalidateTokenForUser(String token, UUID userId)
}