package com.xf.control;


import com.xf.dto.Page;
import com.xf.dto.RoleDto;
import com.xf.pojo.UserInfo;
import com.xf.service.UserInfoAllService;
import com.xf.vo.UserListVo;
import com.xf.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserInfoAllController {
    @Autowired
    UserInfoAllService userInfoAllService;

    //查询所有
    @RequestMapping("listUserInfoAll")
    @ResponseBody
    public Object listUserInfoAll(@RequestParam(value = "currentPage",defaultValue = "1",required = false) int currentPage, HttpSession session){

        Page<UserInfo> userInfoPage = userInfoAllService.listUserInfoAll(currentPage);

        session.setAttribute("currentPage",currentPage);


        return userInfoPage;
    }

    //通过id查询个人信息
    @ResponseBody
    @RequestMapping("listUserInfo")
    public Object listUserInfo(@RequestParam int userId){

        UserInfo userInfo = userInfoAllService.listUserInfo(userId);

        return userInfo;
    }

    //修改个人信息
    @ResponseBody
    @RequestMapping("updateUserInfoById")
    public int updateUserInfoById(@RequestBody UserInfo userInfo){

        int i = userInfoAllService.updateUserInfoById(userInfo);
        return i;
    }

    //删除个人信息
    @ResponseBody
    @RequestMapping("deleteUserInfoById")
    public int deleteUserInfoById(@RequestParam int userId){

        int i = userInfoAllService.deleteUserInfoById(userId);
        return i;
    }

    //新增用户信息
    @ResponseBody
    @RequestMapping("insertUserInfo")
    public int insertUserInfo(@RequestBody UserInfo userInfo){
        int i = userInfoAllService.insertUserInfo(userInfo);
        return i;
    }

    //多项选择删除
    @ResponseBody
    @RequestMapping("deleteAll")
    public int deleteAll(@RequestParam(value = "checkedList",required = false,defaultValue = "") Integer[] checkedList){

        List<Integer> list = Arrays.asList(checkedList);

        UserListVo userListVo = new UserListVo();
        userListVo.setList(list);

        int i = userInfoAllService.deleteAll(userListVo);
        return i;
    }
    //查询用户身份信息
    @ResponseBody
    @RequestMapping("listRoleDto")
    public Object listRoleDto(@RequestParam int userId){

        List<RoleDto> roleDtos = userInfoAllService.listRoleDtoById(userId);

        return roleDtos;
    }

    //修改用户角色信息
    @ResponseBody
    @RequestMapping("updateUserRoleById")
    public Object updateUserRoleById(@RequestParam int userId, @RequestParam(value="roleId[]",required = true) List<Integer> roleIds){

        System.out.println(userId+" : "+roleIds);
        UserRoleVo userRoleVo = new UserRoleVo();
        userRoleVo.setUserId(userId);
        userRoleVo.setRoleIds(roleIds);

        userInfoAllService.deleteUserRoleById(userId);
        int i = userInfoAllService.updateUserRoleById(userRoleVo);
        System.out.println(i);
        return i;

    }

}
