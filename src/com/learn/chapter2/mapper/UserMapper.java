package com.learn.chapter2.mapper;

import com.learn.chapter2.po.User;

/**
 * Created by chl1327 on 2017/7/23.
 */
public interface UserMapper {
    public User getUser(Long id);
    public int insertUser(User user);
    public int countFirstName(String firstName);
}
