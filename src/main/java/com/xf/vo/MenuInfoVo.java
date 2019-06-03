package com.xf.vo;

public class MenuInfoVo {

    int roleId;
    String roleName;
    String shortName;
    int menuId;
    String menu_name;

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

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    @Override
    public String toString() {
        return "MenuInfoVo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", menuId=" + menuId +
                ", menu_name='" + menu_name + '\'' +
                '}';
    }
}
