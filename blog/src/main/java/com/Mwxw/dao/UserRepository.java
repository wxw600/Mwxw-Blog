package com.Mwxw.dao;

import com.Mwxw.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-13
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
