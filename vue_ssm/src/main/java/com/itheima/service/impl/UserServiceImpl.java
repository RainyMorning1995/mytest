package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public User findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public User update(User user) {
        return dao.update(user);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
