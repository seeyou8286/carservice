package com.jiufeng.car.controller;

import com.jiufeng.car.dao.IParkingLotsDao;
import com.jiufeng.car.entity.ParkingsLots;
import com.jiufeng.car.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Chen Chao on 3/17/2017.
 */
@RestController
@RequestMapping("/park")
public class ParkingLotsController {

    @Autowired
    IParkingLotsDao parkingLotsDao;


    @RequestMapping
            (value = {"/save"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveParkingLot(@RequestHeader HttpHeaders requestHeader,
                                            @RequestBody String requestBody) throws Exception {
        ParkingsLots parkingLot = JsonUtil.fromJson(requestBody, ParkingsLots.class);
        parkingLotsDao.save(parkingLot);
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping
            (value = {"/find"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findByAirportName(@RequestHeader HttpHeaders requestHeader,
                                                 @RequestBody String requestBody) throws Exception {
        ParkingsLots parkingLot = JsonUtil.fromJson(requestBody, ParkingsLots.class);
        List<ParkingsLots> parkingLotList = parkingLotsDao.findByAirportName(parkingLot);
        ResponseEntity responseEntity = new ResponseEntity(parkingLotList, HttpStatus.OK);
        return responseEntity;
    }

}
