package com.xf.service.impl;

import com.xf.dto.MenuInfoDto;
import com.xf.mapper.MenuInfoMapper;
import com.xf.service.MenuInfoService;
import com.xf.vo.RoleMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    MenuInfoMapper menuInfoMapper;


    public List<MenuInfoDto> listMenu(int roleId) {
        return menuInfoMapper.listMenu(roleId);
    }

    public List<MenuInfoDto> listMenuByUserId(int userId) {

        return menuInfoMapper.listMenuByUserId(userId);
    }


    //删除对应的roleId的权限分配列表
    public int deleteRoleMenuById(int roleId) {
        return menuInfoMapper.deleteRoleMenuById(roleId);
    }
    //添加修改后的权限分配列表
    public int updateRoleMenuById(RoleMenuVo roleMenuVo) {

        return menuInfoMapper.updateRoleMenuById(roleMenuVo);
    }
}
