package com.zking.nacosprovider.service;


import com.zking.nacosprovider.model.sysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author TimeDip
 */
@Transactional(rollbackFor =Exception.class)
public interface IsysUserService {


    List<sysUser> listSysUser(sysUser user);

}