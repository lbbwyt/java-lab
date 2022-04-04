package com.example.pagehelper.service;

import com.example.pagehelper.entity.mo.User;
import com.example.pagehelper.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserMapper userMapper;


    public List<User> LisAll() {
        return  userMapper.selectList(null);
    }

}
