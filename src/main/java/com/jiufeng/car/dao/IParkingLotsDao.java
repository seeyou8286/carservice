package com.jiufeng.car.dao;

import com.jiufeng.car.entity.ParkingsLots;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IParkingLotsDao {
    void save(ParkingsLots parkingLot);

    List<ParkingsLots> findByAirportName(ParkingsLots parkingLot);

//    int updateByCityName(ParkingsLots parkingLot);

}

