package io.github.sornerol.speedrunrankingsapi.service

import groovy.transform.CompileStatic
import io.github.sornerol.speedrunrankingsapi.model.SrrUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@CompileStatic
@Service
class JwtUserDetailsService implements UserDetailsService {
    private SrrUserService userService

    @Autowired
    JwtUserDetailsService(SrrUserService userService) {
        this.userService = userService
    }

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SrrUser user = userService.getUserByUsername(username)
        if (!user) {
            throw new UsernameNotFoundException("No account found for username '${username}'")
        }
        new User(username,
                user.password,
                user.enabled,
                true,
                true,
                true,
                grantedAuthoritiesForUser(user))
    }

    private static List<GrantedAuthority> grantedAuthoritiesForUser(SrrUser user) {
        List<GrantedAuthority> authorities = []

        user.siteRoles?.each { role ->
            authorities << new SimpleGrantedAuthority("ROLE_${role}")
        }
        user.additionalPermissions?.each { privilege ->
            authorities << new SimpleGrantedAuthority(privilege)
        }
        authorities
    }
}
