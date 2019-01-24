package com.example.myframe.model;

import javax.persistence.*;

/**
 * @program: myframe
 * @description:
 * @author: GTL
 * @create: 2019-01-23 14:18
 **/
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String uuid;   //用户UUID
    @Column(length = 20)
    private String username;    //用户名
    private String password;    //用户密码
    @Column(length = 100)
    private String email;       //用户邮箱
    @Column(length = 20)
    private String telephone;   //电话号码
    @Column(length = 10)
    private String role;        //用户角色
    private String image;       //用户头像
    @Column(length = 50)
    private String last_ip;     //上次登录IP
    private String last_time;   //上次登录时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", role='" + role + '\'' +
                ", image='" + image + '\'' +
                ", last_ip='" + last_ip + '\'' +
                ", last_time='" + last_time + '\'' +
                '}';
    }
}
