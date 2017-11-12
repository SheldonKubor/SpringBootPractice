package com.mjh.controller;

import com.mjh.dao.UserRepository;
import com.mjh.model.User;
import com.mjh.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:mjh
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户")
    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        List<User> userList = userService.getAllUser();
        return userList;
    }

    @ApiOperation(value = "添加一个用户",notes = "只需传入username和password")
    @PostMapping(value = "/add")
    public User addUser(User user){
        User user1 = userService.addUser(user);
        return user1;
    }

    @ApiOperation(value = "根据id获取用户")
    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Integer id){
        User user = userService.getOneUser(id);
        return user;
    }

    @ApiOperation(value = "更新用户信息")
    @PutMapping(value = "/{id}")
    public User updateUser(@PathVariable Integer id,@RequestParam("username") String username,@RequestParam("password") String password){
        User user = new User();
        user.setId(id);
        user.setName(username);
        user.setPassword(password);

        return userService.updateUser(user);
    }
}
