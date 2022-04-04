package com.example.pagehelper.controller;

import com.example.pagehelper.core.Pagination;
import com.example.pagehelper.entity.common.Result;
import com.example.pagehelper.entity.mo.User;
import com.example.pagehelper.entity.req.UserQueryReq;
import com.example.pagehelper.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 列出所有用户
     * @return
     */
    @Pagination
    @GetMapping("/list")
    public Result list(UserQueryReq query) {
        List<User> userList = userService.LisAll();
        return Result.ok(userList);
    }

}
