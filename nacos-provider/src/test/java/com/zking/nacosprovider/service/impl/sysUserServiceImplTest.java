package com.zking.nacosprovider.service.impl;

import com.zking.nacosprovider.model.Dictionary;
import com.zking.nacosprovider.model.sysUser;
import com.zking.nacosprovider.service.DictionaryService;
import com.zking.nacosprovider.service.IsysUserService;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class sysUserServiceImplTest {

    @Autowired(required = false)
    private IsysUserService userService;

    @Autowired
    private DictionaryService dictionaryService;

    private sysUser user;

    private Dictionary dictionary;

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("aaaaaaa");
        user=new sysUser();
        dictionary=new Dictionary();
    }

    @Test
    public void listSysUser() {

//        List<sysUser> sysUsers = userService.listSysUser(user);
//        for (sysUser sysUser : sysUsers) {
//            System.out.println(sysUser);
//        }
        Dictionary byId = dictionaryService.getById("1");
        System.out.println(byId);

    }



}
