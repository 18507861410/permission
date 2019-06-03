package com.xf.mapper;

import com.xf.pojo.UserInfo;
import com.xf.vo.RoleInfoVo;
import com.xf.vo.UserInfoVo;

import java.util.List;

/**
 * Created by DELL on 2019/5/9.
 */
public interface UserInfoMapper {

    //登录
    public UserInfo userLogin(UserInfoVo userInfoVo);

    public List<UserInfo> listUserInfoBy(UserInfoVo userInfoVo);

    public int insertBy(UserInfoVo userInfoVo);

    public int updateBy(UserInfo userInfo);

    public int deleteBy(UserInfoVo userInfo);

    public List<RoleInfoVo> listRoleByUserId(int roleId);

    public List<UserInfo> listUserInfoAndRoleInfo();
    //注册
    public int insertAll(UserInfo userInfo);



}

