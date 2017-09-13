package com.learn.chapter2.mapper;

import com.learn.chapter2.po.Role;
import com.learn.chapter2.po.RoleParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by chl1327 on 2017/7/16.
 */
public interface RoleMapper {
    public Role getRole(Long id);
    public Role findRole(String roleName);
    //public List<Role> findRoleByMap(@Param("roleName")String rolename,@Param("note")String note);
    public List<Role> findRoleByMap(Map<String,String> paramsMap);
    public List<Role> findRoleByParams(RoleParam params);
    public int deleteRole(Long id);
    public int insertRole(Role role);
}
