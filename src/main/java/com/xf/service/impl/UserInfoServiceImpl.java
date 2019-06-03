package com.xf.service.impl;

import com.xf.mapper.UserInfoMapper;
import com.xf.pojo.UserInfo;
import com.xf.service.UserInfoService;
import com.xf.tool.MD5Utils;
import com.xf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;
    //登录
    public UserInfo userLogin(UserInfoVo userInfoVo) {
    //解密后登录
        userInfoVo.setPassword(MD5Utils.myEncode(userInfoVo.getPassword()));
        UserInfo userInfos = userInfoMapper.userLogin(userInfoVo);

        return userInfos;
    }



    public int updateBy(UserInfo userInfo) {

        int i = userInfoMapper.updateBy(userInfo);

        return i;
    }
    //注册
    public int insertAll(UserInfo userInfo) {
        //给密码加密
        String s = MD5Utils.myEncode(userInfo.getPassword());
        userInfo.setPassword(s);
        int i = userInfoMapper.insertAll(userInfo);
        if (i != 0){
            return i;
        }
        return 0;
    }
}
