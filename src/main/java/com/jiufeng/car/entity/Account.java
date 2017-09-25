package com.jiufeng.car.entity;

import lombok.Data;

@Data
public class Account {
    private String phoneNumber;
    private String password;


    public Account() {
    }

    public Account(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
