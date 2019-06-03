package com.xf.vo;

import java.util.List;

public class RoleMenuVo {

    int roleId;

    List<Integer> menuId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getMenuId() {
        return menuId;
    }

    public void setMenuId(List<Integer> menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "RoleMenuVo{" +
                "roleId=" + roleId +
                ", menuIds=" + menuId +
                '}';
    }
}
