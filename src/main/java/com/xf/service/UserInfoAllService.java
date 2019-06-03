package com.xf.service;

import com.github.pagehelper.PageInfo;
import com.xf.dto.Page;
import com.xf.dto.RoleDto;
import com.xf.pojo.UserInfo;
import com.xf.vo.UserListVo;
import com.xf.vo.UserRoleVo;


import java.util.List;

public interface UserInfoAllService {
    //获取分页的总数量
    public int countUserInfo();
    //查询所有
   public Page<UserInfo> listUserInfoAll(int currentPage);
    //查询个人
    public UserInfo listUserInfo(int userId);
    //修改个人信息
    public int updateUserInfoById(UserInfo userInfo);
    //删除个人信息
    public int deleteUserInfoById(int userId);
    //新增用户信息
    public int insertUserInfo(UserInfo userInfo);
    //多项选择删除
    public int deleteAll(UserListVo userListVo);
    //查询用户身份信息
    public List<RoleDto> listRoleDtoById(int userId);
    //删除用户角色信息
    public int deleteUserRoleById(int userId);
    //添加重新选择后的用户角色
    public int updateUserRoleById(UserRoleVo userRoleVo);
}
