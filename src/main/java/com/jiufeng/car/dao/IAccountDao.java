package com.jiufeng.car.dao;

import com.jiufeng.car.entity.Account;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IAccountDao {
    void save(Account account);

    Account findByPhoneNumber(Account phoneNumber);

}

