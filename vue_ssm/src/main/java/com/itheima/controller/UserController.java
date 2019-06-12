package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/findById.do")
    public User findById(Integer id){
        User byId = service.findById(id);
        System.out.println(byId);
        return byId;

    }

    @RequestMapping("/update.do")
    public User update(@RequestBody User user){
        User update = service.update(user);
        System.out.println(update);
        return update;
    }

    @RequestMapping("/findAll.do")
    public List<User> findAll(){
        List<User> all = service.findAll();
        return all;

    }

}
