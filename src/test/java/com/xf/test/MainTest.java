package com.xf.test;

import com.xf.dto.MenuInfoDto;
import com.xf.dto.Page;
import com.xf.dto.RoleDto;
import com.xf.pojo.UserInfo;
import com.xf.service.MenuInfoService;
import com.xf.service.RoleInfoAllService;
import com.xf.service.UserInfoAllService;
import com.xf.service.UserInfoService;

import com.xf.vo.RoleInfoVo;
import com.xf.vo.RoleMenuVo;
import com.xf.vo.UserInfoVo;
import com.xf.vo.UserRoleVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");

    UserInfoService s = applicationContext.getBean(UserInfoService.class);
    UserInfoAllService s1 = applicationContext.getBean(UserInfoAllService.class);
    RoleInfoAllService s2 = applicationContext.getBean(RoleInfoAllService.class);
    MenuInfoService s3 = applicationContext.getBean(MenuInfoService.class);

    @Test
    public void test(){

        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setUserName("tiantian");
        userInfoVo.setPassword("123456");

        UserInfo userInfos = s.userLogin(userInfoVo);


        System.out.println(userInfos);
    }

    @Test
    public void test1(){

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("小明");
        userInfo.setPassword("654321");
        userInfo.setUserId(1);

        int i = s.updateBy(userInfo);
        System.out.println(i);

    }
    @Test
    public void test2(){

//        List<UserInfo> userInfos = s1.listUserInfoAll();
//
//        System.out.println(userInfos);
    }

    @Test
    public void test3(){

        UserInfo userInfo = s1.listUserInfo(2);
        System.out.println(userInfo);
    }
    @Test
    public void test4(){

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("aaa");
        userInfo.setPassword("13456");
        userInfo.setRegEmail("123@163.com");
        userInfo.setMobile("123456789");
        userInfo.setUserId(6);
        int i = s1.updateUserInfoById(userInfo);
        System.out.println(i);
    }
    @Test
    public void test5(){

        int i = s1.deleteUserInfoById(6);
        System.out.println(i);
    }
    @Test
    public void test6(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("111aa");
        userInfo.setPassword("12346");
        userInfo.setRegEmail("123456@123.com");
        userInfo.setMobile("13246589");

        int i = s1.insertUserInfo(userInfo);
        System.out.println(i);
    }

    @Test
    public void test7(){

        List<RoleDto> roleDtos = s1.listRoleDtoById(1);

        System.out.println(roleDtos);

    }
    @Test
    public void test8(){
        List<RoleInfoVo> roleInfoVos = s2.listRoleInfo();

        System.out.println(roleInfoVos);
    }
    @Test
    public void test9(){

        RoleInfoVo roleInfoVo = new RoleInfoVo();

        roleInfoVo.setRoleName("人员");
        roleInfoVo.setShortName("XT");

        List<RoleDto> roleDtos = s2.roleInfoBy(roleInfoVo);
        System.out.println(roleDtos);
    }

    @Test
    public void test11(){
        List<MenuInfoDto> menuInfoDtos = s3.listMenuByUserId(1);

        System.out.println(menuInfoDtos);
    }

    @Test
    public void test12(){

        UserRoleVo userRoleVo = new UserRoleVo();
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        userRoleVo.setUserId(1);
        userRoleVo.setRoleIds(list);

        int i = s1.updateUserRoleById(userRoleVo);

        System.out.println(i);
    }

    @Test
    public void test13(){

        RoleMenuVo roleMenuVo = new RoleMenuVo();
        roleMenuVo.setRoleId(3);
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        roleMenuVo.setMenuId(list);
        int i = s3.updateRoleMenuById(roleMenuVo);
        System.out.println(i);
    }
    @Test
    public void test14(){

        int i = s1.countUserInfo();
        System.out.println(i);
    }
    @Test
    public void test15(){
        List<MenuInfoDto> menuInfoDtos = s3.listMenuByUserId(1);
        System.out.println(menuInfoDtos);
    }
    @Test
    public void test16(){


        Page<UserInfo> userInfoPage = s1.listUserInfoAll(3);

        System.out.println(userInfoPage);
    }
}
