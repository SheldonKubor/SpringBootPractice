package com.mjh.service;

import com.mjh.dao.UserRepository;
import com.mjh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author constantine
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    public List<User> getAllUser() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User updateUser(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    public User deleteUser(Integer id) {
        User user = userRepository.findOne(id);
        userRepository.delete(id);
        return user;
    }

    public User getOneUser(Integer id) {
        User user = userRepository.findOne(id);
        return user;
    }
}
