package io.github.sornerol.speedrunrankingsapi.service.auth.factory

import io.github.sornerol.speedrunrankingsapi.service.auth.RefreshTokenService

class RefreshTokenServiceFactory {
    static RefreshTokenService getService(String service) {
        if (!service) {
            return null
        }

        switch (service) {
            //TODO: Add RefreshTokenService implementations
            default:
                throw new IllegalArgumentException('Unknown implementation: ' + service)
        }
    }
}
