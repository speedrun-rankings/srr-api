package io.github.sornerol.speedrunrankingsapi.service

import groovy.transform.CompileStatic
import io.github.sornerol.speedrunrankingsapi.model.SrrUser
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import static io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.Tables.USER

@CompileStatic
@Service
class SrrUserService {

    private DSLContext dslContext

    @Autowired
    SrrUserService(DSLContext dslContext) {
        this.dslContext = dslContext
    }

    SrrUser getUserByUsername(String username) {
        SrrUser user = dslContext
                .select()
                .from(USER)
                .where(USER.USERNAME.eq(username))
                .fetchOne()
                .into(SrrUser)
//        getRolesAndAuthoritiesForUser(user)
        user
    }

//    private void getRolesAndAuthoritiesForUser(SrrUser user) {
//        if (!user) {
//            return
//        }
//        user.siteRoles = userMapper.getRolesForUser(user.id)
//        user.additionalPermissions = userMapper.getPrivilegesForUser(user.id)
//    }
}
