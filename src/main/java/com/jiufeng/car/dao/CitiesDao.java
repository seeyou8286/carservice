package com.jiufeng.car.dao;

import com.jiufeng.car.entity.Cities;

/**
 * Created by chachen on 9/22/2017.
 */
public interface CitiesDao {
    void saveCitieInfo(Cities cities);

    void deleteUserById(Long id);
}

