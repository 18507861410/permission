package com.xf.control;


import com.xf.dto.RoleDto;
import com.xf.service.RoleInfoAllService;
import com.xf.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleInfoAllController {

    @Autowired
    RoleInfoAllService roleInfoAllService;
    //显示角色信息
    @RequestMapping("listRoleInfo")
    public Object listRoleInfo(){

        List<RoleInfoVo> roleInfoVos = roleInfoAllService.listRoleInfo();

        return roleInfoVos;
    }
    //模糊查询角色
    @RequestMapping("roleInfoBy")
    public Object roleInfoBy(@RequestBody RoleInfoVo roleInfoVo){

        List<RoleDto> roleDtos = roleInfoAllService.roleInfoBy(roleInfoVo);

        System.out.println(roleDtos);
        return roleDtos;
    }
}
