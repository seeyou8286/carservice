package com.jiufeng.car.dao.impl;


import com.jiufeng.car.dao.IAirportDao;
import com.jiufeng.car.entity.Account;
import com.jiufeng.car.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AirportDao implements IAirportDao {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void save(Airport airport) {
        mongoTemplate.save(airport);
    }

    @Override
    public List<Airport> findAll() {
        List<Airport> airportList = mongoTemplate.findAll(Airport.class);
        return airportList;
    }
}
