package com.jiufeng.car.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Account implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private String phoneNumber;
    private String password;

    public Account(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
