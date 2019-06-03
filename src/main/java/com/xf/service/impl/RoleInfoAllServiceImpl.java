package com.xf.service.impl;

import com.xf.dto.RoleDto;
import com.xf.mapper.RoleInfoAllMapper;
import com.xf.service.RoleInfoAllService;
import com.xf.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoAllServiceImpl implements RoleInfoAllService {

    @Autowired
    RoleInfoAllMapper roleInfoAllMapper;

    public List<RoleInfoVo> listRoleInfo() {
        return roleInfoAllMapper.listRoleInfo();
    }

    public List<RoleDto> roleInfoBy(RoleInfoVo roleInfoVo) {

        return roleInfoAllMapper.roleInfoBy(roleInfoVo);
    }
}
