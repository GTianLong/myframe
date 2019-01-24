package com.example.myframe.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: myframe
 * @description:
 * @author: GTL
 * @create: 2019-01-23 14:41
 **/
public class MyEncoder {
    public String encoder(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        return encoder.encode(password);
    }
}
