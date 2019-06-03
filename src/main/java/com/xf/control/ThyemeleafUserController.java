package com.xf.control;

import com.xf.pojo.UserInfo;
import com.xf.service.UserInfoAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThyemeleafUserController {

    @Autowired
    UserInfoAllService userInfoAllService;

    @RequestMapping("testTwo")
    public Object testTwo(ModelMap map){

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("a");
        userInfo.setRegEmail("ad@163.com");
        userInfo.setMobile("123");

        UserInfo userInfo1 = new UserInfo();
        userInfo.setUserName("b");
        userInfo.setRegEmail("ad@163.com");
        userInfo.setMobile("123");

        UserInfo userInfo2 = new UserInfo();
        userInfo.setUserName("c");
        userInfo.setRegEmail("ad@163.com");
        userInfo.setMobile("123");

        UserInfo userInfo3 = new UserInfo();
        userInfo.setUserName("d");
        userInfo.setRegEmail("ad@163.com");
        userInfo.setMobile("123");

        List<UserInfo> userInfoList = new ArrayList<UserInfo>();
        userInfoList.add(userInfo);
        userInfoList.add(userInfo1);
        userInfoList.add(userInfo2);
        userInfoList.add(userInfo3);

        map.put("userList",userInfoList);

        return "thyuser";
    }

}
