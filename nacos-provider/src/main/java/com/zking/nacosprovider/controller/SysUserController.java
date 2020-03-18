package com.zking.nacosprovider.controller;


import com.zking.nacosprovider.model.sysUser;
import com.zking.nacosprovider.service.IsysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired(required = false)
    private IsysUserService userService;


    @RequestMapping("/listUser")
    public List<sysUser> list( sysUser user){
        return userService.listSysUser(user);
    }


}
