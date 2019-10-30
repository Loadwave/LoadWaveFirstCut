package com.skilldrive.app.model;

import javax.persistence.*;
import javax.ws.rs.FormParam;

import java.io.Serializable;

@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @FormParam("userId")
    private Long userId;
    @Column
    @FormParam("userName")
    private String userName;
    @Column
    @FormParam("useraddress")
    private String address;

    public User(){}

    public User(Long userId, String userName, String address){
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}