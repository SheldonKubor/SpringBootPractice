package com.mjh.controller;

import com.mjh.dao.UserRepository;
import com.mjh.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:mjh
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/hello")
    public User hello(){
        User user = new User();
        user.setName("ccc");
        user.setPassword("ccc");
        User user1 = userRepository.save(user);
        logger.debug("username is {}",user.getName());
        return user1;
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @PostMapping(value = "/add")
    public User addUser(User user){
        User user1 = userRepository.save(user);
        return user1;
    }

    @GetMapping(value = "/{id}")
    public User getUserByName(@PathVariable Integer id){
        User user = userRepository.findOne(id);
        return user;
    }
}
