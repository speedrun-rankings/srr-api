/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SiteRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String  roleName;

    public SiteRole(SiteRole value) {
        this.id = value.id;
        this.roleName = value.roleName;
    }

    public SiteRole(
        Integer id,
        String  roleName
    ) {
        this.id = id;
        this.roleName = roleName;
    }

    /**
     * Getter for <code>srrdb.site_role.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>srrdb.site_role.role_name</code>.
     */
    public String getRoleName() {
        return this.roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SiteRole (");

        sb.append(id);
        sb.append(", ").append(roleName);

        sb.append(")");
        return sb.toString();
    }
}
