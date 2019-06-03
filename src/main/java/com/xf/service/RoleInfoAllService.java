package com.xf.service;

import com.xf.dto.RoleDto;
import com.xf.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoAllService {

    //显示所有角色
    public List<RoleInfoVo> listRoleInfo();
    //模糊查询角色
    public List<RoleDto> roleInfoBy(RoleInfoVo roleInfoVo);

}
