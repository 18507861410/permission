package com.xf.mapper;

import com.xf.dto.MenuInfoDto;
import com.xf.vo.RoleMenuVo;

import java.util.List;

public interface MenuInfoMapper {

    public List<MenuInfoDto> listMenu(int roleId);

    public List<MenuInfoDto> listMenuByUserId(int userId);

    //删除对应的roleId的权限分配列表
    public int deleteRoleMenuById(int roleId);
    //添加修改后的权限分配列表
    public int updateRoleMenuById(RoleMenuVo roleMenuVo);
}
