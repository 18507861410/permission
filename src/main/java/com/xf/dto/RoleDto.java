package com.xf.dto;

public class RoleDto {

    int roleId;
    String roleName;
    String shortName;
    int isnull;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getIsnull() {
        return isnull;
    }

    public void setIsnull(int isnull) {
        this.isnull = isnull;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", isnull=" + isnull +
                '}';
    }
}
