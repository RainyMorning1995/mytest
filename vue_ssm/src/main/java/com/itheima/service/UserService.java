package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    User update(User user);

    List<User> findAll();
}
