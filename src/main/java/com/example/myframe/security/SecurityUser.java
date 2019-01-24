package com.example.myframe.security;

import com.example.myframe.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: myframe
 * @description:
 * @author: GTL
 * @create: 2019-01-23 14:26
 **/
public class SecurityUser extends User implements UserDetails {

    public SecurityUser(User user) {
        if (user != null) {
            this.setUuid(user.getUuid());
            this.setUsername(user.getUsername());
            this.setPassword(user.getPassword());
            this.setEmail(user.getEmail());
            this.setTelephone(user.getTelephone());
            this.setRole(user.getRole());
            this.setImage(user.getImage());
            this.setLast_ip(user.getLast_ip());
            this.setLast_time(user.getLast_time());
        }
    }

    public static User getUser() { //为了session从获取用户信息,可以配置如下
        User user = new User();
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) user = (User) auth.getPrincipal();
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        String username = this.getUsername();
        if (username != null) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(username);
            authorities.add(authority);
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
