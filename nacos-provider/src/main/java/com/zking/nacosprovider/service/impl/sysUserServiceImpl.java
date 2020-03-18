package com.zking.nacosprovider.service.impl;


import com.zking.nacosprovider.mapper.sysUserMapper;
import com.zking.nacosprovider.model.sysUser;
import com.zking.nacosprovider.service.IsysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class sysUserServiceImpl implements IsysUserService {
    @Autowired(required = false)
    private  sysUserMapper userMapper;

    @Override
    public List<sysUser> listSysUser(sysUser user) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXxxxxx");
        return userMapper.listSysUser(user);
    }


}
