package com.example.myframe.controller;

import com.example.myframe.model.User;
import com.example.myframe.security.SecurityUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: myframe
 * @description:
 * @author: GTL
 * @create: 2019-01-23 14:33
 **/
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String root(Model model) {
        model.addAttribute("user",SecurityUser.getUser());
        return "index";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，用户名或者密码错误");
        return "login";
    }



    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
