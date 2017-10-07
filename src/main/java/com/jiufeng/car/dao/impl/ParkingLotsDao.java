package com.jiufeng.car.dao.impl;

import com.jiufeng.car.dao.IParkingLotDao;
import com.jiufeng.car.entity.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
@Component
public class ParkingLotsDao implements IParkingLotDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void save(ParkingLot parkingLot) {
        mongoTemplate.save(parkingLot);
    }

    @Override
    public List<ParkingLot> findByAirportName(ParkingLot parkingLot) {
        Query query = new Query(Criteria.where("airportName").is(parkingLot.getAirportName()));
        List<ParkingLot> parkingLotList =  mongoTemplate.find(query, ParkingLot.class);
        if(parkingLotList  == null || parkingLotList.size() ==0)
        {
            return null;
        }
        return parkingLotList;
    }

//    @Override
//    public int updateByCityName(ParkingsLots parkingLot) {
//        Query query=new Query(Criteria.where("cityName").is(parkingLot.getCityName()));
//        Update update= new Update()
//                .set("cityName", parkingLot.getCityName())
//                .set("airportName", parkingLot.getAirportName())
//                .set(("placeName"),parkingLot.getPlaceName());
//        WriteResult result =mongoTemplate.updateFirst(query,update,ParkingsLots.class);
//        if(result!=null)
//            return result.getN();
//        else
//            return 0;
//    }

}
