package com.xf.service;


import com.xf.pojo.UserInfo;
import com.xf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService {

    //登录
    public UserInfo userLogin(UserInfoVo userInfoVo);

    public int updateBy(UserInfo userInfo);
    //注册
    public int insertAll(UserInfo userInfo);


}
