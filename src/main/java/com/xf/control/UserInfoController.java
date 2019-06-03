package com.xf.control;

import com.xf.pojo.UserInfo;
import com.xf.service.UserInfoService;
import com.xf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

//声明这个类是一个控制器，这样它就能被扫描到
@Controller
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;
    //登录
    @RequestMapping("loginController")
    @ResponseBody
    public String loginController(@RequestBody UserInfoVo userInfoVo, HttpSession session) {

        UserInfo userInfos = (UserInfo) userInfoService.userLogin(userInfoVo);

        if (userInfos!=null) {
            session.setAttribute("userInfos",userInfos);
            return "true";

        } else {

            return "false";
        }

    }
    //注册
    @RequestMapping("indexController")
    @ResponseBody
    public Object index(@RequestBody UserInfo userInfo){

        int i = userInfoService.insertAll(userInfo);

        if(i != 0){
            return true;
        }else {
            return false;
        }
    }
}