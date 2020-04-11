package com.Mwxw.service;


import com.Mwxw.po.User;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-20
 */
public interface UserService {

    User checkUser(String username, String password);
    User getUser(Long id);

}
