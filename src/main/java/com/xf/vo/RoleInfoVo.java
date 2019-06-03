package com.xf.vo;

public class RoleInfoVo {

    int roleId;
    String roleName;
    String shortName;
    String isSelected;


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

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "RoleInfoVo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", isSelected='" + isSelected + '\'' +
                '}';
    }
}
