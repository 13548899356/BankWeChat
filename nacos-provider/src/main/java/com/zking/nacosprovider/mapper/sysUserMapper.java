package com.zking.nacosprovider.mapper;




import com.zking.nacosprovider.model.sysUser;

import java.util.List;

/**
 * @author TimeDip
 */
public interface sysUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(sysUser record);

    int updateByPrimaryKey(sysUser record);

    List<sysUser> listSysUser(sysUser user);


}