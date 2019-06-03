package com.xf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xf.dto.Page;
import com.xf.dto.RoleDto;
import com.xf.mapper.UserInfoAllMapper;

import com.xf.pojo.UserInfo;
import com.xf.service.UserInfoAllService;


import com.xf.vo.UserListVo;
import com.xf.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserInfoAllServiceImpl implements UserInfoAllService {

    @Autowired
    UserInfoAllMapper userInfoAllMapper;
    //获取分页的总数量
    public int countUserInfo() {
        return userInfoAllMapper.countUserInfo();
    }

    //查询所有
    public Page<UserInfo> listUserInfoAll(int currentPage) {

        HashMap<String, Object> map = new HashMap<String, Object>();
        Page<UserInfo> page1 = new Page<UserInfo>();
            //封装当前页数
            page1.setCurrPage(currentPage);
            //每页显示的数据
            int pageSize = 4;
            page1.setPageSize(pageSize);

            //封装总记录数
            int totalCount = userInfoAllMapper.countUserInfo();
            page1.setTotalCount(totalCount);

            //封装总页数
            double tc = totalCount;
            Double num = Math.ceil(tc/totalCount);//向上取整
            page1.setTotalPage(num.intValue());

            map.put("start",(currentPage-1)*pageSize);
            map.put("size",page1.getPageSize());
            //封装每页显示的数据
        List<UserInfo> lists = userInfoAllMapper.listUserInfoAll(map);
        page1.setLists(lists);

        return page1;
    }

    //查询个人
    public UserInfo listUserInfo(int userId) {

        UserInfo userInfo1 = userInfoAllMapper.listUserInfo(userId);

        return userInfo1;
    }
    //修改个人信息
    public int updateUserInfoById(UserInfo userInfo) {

        int i = userInfoAllMapper.updateUserInfoById(userInfo);
        return i;
    }
    //删除个人信息
    public int deleteUserInfoById(int userId) {

        int i = userInfoAllMapper.deleteUserInfoById(userId);
        return i;
    }

    //新增用户信息
    public int insertUserInfo(UserInfo userInfo) {
        int i = userInfoAllMapper.insertUserInfo(userInfo);
        return i;
    }
    //多项选择删除
    public int deleteAll(UserListVo userListVo) {

        int i = userInfoAllMapper.deleteAll(userListVo);

        return i;
    }

    //查询用户身份信息
    public List<RoleDto> listRoleDtoById(int userId) {

        List<RoleDto> roleDtos = userInfoAllMapper.listRoleDtoById(userId);

        return roleDtos;
    }


    //删除用户角色信息
    public int deleteUserRoleById(int userId) {

        return userInfoAllMapper.deleteUserRoleById(userId);
    }
    //添加重新选择后的用户角色
    public int updateUserRoleById(UserRoleVo userRoleVo) {

        return userInfoAllMapper.updateUserRoleById(userRoleVo);
    }


}
