package com.jiufeng.car.dao;

import com.jiufeng.car.entity.Airport;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IAirportDao {
    void save(Airport airport);

    List<Airport> findAll();


}

