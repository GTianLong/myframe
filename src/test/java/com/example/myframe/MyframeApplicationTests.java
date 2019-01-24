package com.example.myframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyframeApplicationTests {

    @Test
    public void contextLoads() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        String enPassword = encoder.encode("123");
        System.out.println("enPassword:"+enPassword);
    }

}