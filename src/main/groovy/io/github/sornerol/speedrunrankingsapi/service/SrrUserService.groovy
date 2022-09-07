package io.github.sornerol.speedrunrankingsapi.service

import groovy.transform.CompileStatic
import io.github.sornerol.speedrunrankingsapi.mapper.UserMapper
import io.github.sornerol.speedrunrankingsapi.model.SrrUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class SrrUserService {

    private UserMapper userMapper

    @Autowired
    SrrUserService(UserMapper userMapper) {
        this.userMapper = userMapper
    }

    SrrUser getUserByUsername(String username) {
        SrrUser user = userMapper.getUserByUsername(username)
//        getRolesAndAuthoritiesForUser(user)
        user
    }

    private void getRolesAndAuthoritiesForUser(SrrUser user) {
        if (!user) {
            return
        }
        user.siteRoles = userMapper.getRolesForUser(user.id)
        user.additionalPermissions = userMapper.getPrivilegesForUser(user.id)
    }
}
