package com.jiufeng.car.dao;

import com.jiufeng.car.entity.ParkingLot;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IParkingLotDao {
    void save(ParkingLot parkingLot);

    List<ParkingLot> findAll();

    int updateByCityName(ParkingLot parkingLot);

}

