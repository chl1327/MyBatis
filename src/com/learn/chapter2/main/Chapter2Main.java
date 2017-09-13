package com.learn.chapter2.main;

import com.learn.chapter2.enums.Sex;
import com.learn.chapter2.mapper.RoleMapper;
import com.learn.chapter2.mapper.UserMapper;
import com.learn.chapter2.po.Role;
import com.learn.chapter2.po.RoleParam;
import com.learn.chapter2.po.User;
import com.learn.chapter2.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chl1327 on 2017/7/16.
 */
public class Chapter2Main {
    public static void main(String[] args) throws IOException{
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            /*UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setUserName("zhangsan");
            user.setCnname("张三");
            user.setMobile("1888888888");
            user.setSex(Sex.MALE);
            user.setEmail("zhangsan@163.com");
            user.setNote("test EnumOrdinalTypeHandler!!");
            user.setBirthday(new Date());
            //userMapper.insertUser(user);
            User user2 = userMapper.getUser(1L);
            int i = userMapper.countFirstName("zhang");
            System.out.println(user2.getSex());
            System.out.println(i);*/
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("test4");
            role.setNote("test4Note");
            //roleMapper.findRole(role.getRoleName());
            roleMapper.insertRole(role);
            System.out.println(role.getId());
            //roleMapper.deleteRole(1L);
            /*Map<String,String> paramsMap = new HashMap<String,String>();
            paramsMap.put("roleName","me");
            paramsMap.put("note","te");
            List<Role> roleList = roleMapper.findRoleByMap(paramsMap);*/
            /*RoleParam roleParam = new RoleParam();
            roleParam.setNote("te");
            roleParam.setRoleName("me");
            List<Role> roleList = roleMapper.findRoleByParams(roleParam);
            for (Role item: roleList){
                System.out.println(item.getRoleName());
            }*/
            sqlSession.commit();
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            sqlSession.rollback();
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
