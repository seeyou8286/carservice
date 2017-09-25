package com.jiufeng.car.dao;

import com.jiufeng.car.entity.Account;
import com.jiufeng.car.entity.ParkingLot;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IAccountDao {
    void save(Account account);

    Account findByPhoneNumber(Account phoneNumber);

}

