package io.github.sornerol.speedrunrankingsapi.mapper

import io.github.sornerol.speedrunrankingsapi.model.SrrUser
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {

    @Select('SELECT * FROM user WHERE username = #{username}')
    SrrUser getUserByUsername(@Param('username') String username)

    @Select('''SELECT r.role_name
               FROM role r
               JOIN user_role_asg ura on r.id = ura.role_id
               WHERE ura.user_id = UNHEX(#{user_id})''')
    List<String> getRolesForUser(@Param('user_id') String userId)

    @Select('''SELECT p.privilege_name
               FROM privilege p
               JOIN user_privilege_asg upa on p.id = upa.privilege_id
               WHERE upa.user_id = UNHEX(#{user_id})''')
    List<String> getPrivilegesForUser(@Param('user_id') String userId)
}