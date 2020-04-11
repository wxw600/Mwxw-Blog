package com.Mwxw.service;

import com.Mwxw.dao.UserRepository;
import com.Mwxw.po.User;
import com.Mwxw.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
    @Override
    public User getUser(Long id){
        return userRepository.findOne(id);
    }
}
