package com.example.myframe.repository;

import com.example.myframe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: myframe
 * @description:
 * @author: GTL
 * @create: 2019-01-23 14:24
 **/
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
