package com.xf.control;


import com.xf.dto.MenuInfoDto;
import com.xf.pojo.UserInfo;
import com.xf.service.MenuInfoService;
import com.xf.vo.RoleMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class MenuInfoController {

    @Autowired
    MenuInfoService menuInfoService;
    //显示结构
    @RequestMapping("menuInfoDtoAll")
    public Object menuInfoDtoAll(@RequestParam int roleId){

        List<MenuInfoDto> menuInfoDtos = menuInfoService.listMenu(roleId);
        return menuInfoDtos;
    }

    @RequestMapping("listMenuByUserId")
    public Object listMenuByUserId(HttpSession httpSession){

        UserInfo userInfos = (UserInfo) httpSession.getAttribute("userInfos");
        System.out.println(userInfos);
        int userId = userInfos.getUserId();
        return menuInfoService.listMenuByUserId(userId);
    }

    //修改权限分配列表
    @RequestMapping("updateRoleMenuById")
    public Object updateRoleMenuById(@RequestParam int roleId,@RequestParam(value = "menuId[]",required = true) List<Integer> menuId){

        System.out.println(roleId+" : "+menuId);
        RoleMenuVo roleMenuVo = new RoleMenuVo();

        roleMenuVo.setRoleId(roleId);
        roleMenuVo.setMenuId(menuId);

        menuInfoService.deleteRoleMenuById(roleId);
        int i = menuInfoService.updateRoleMenuById(roleMenuVo);
        System.out.println(i);
        return i;
    }

}
