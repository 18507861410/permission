package com.xf.mapper;

import com.xf.dto.RoleDto;
import com.xf.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoAllMapper {

   //显示所有角色
   public List<RoleInfoVo> listRoleInfo();
   //模糊查询角色
   public List<RoleDto> roleInfoBy(RoleInfoVo roleInfoVo);
}
