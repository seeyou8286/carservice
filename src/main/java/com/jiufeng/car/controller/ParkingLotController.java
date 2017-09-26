package com.jiufeng.car.controller;

import com.jiufeng.car.dao.IParkingLotDao;
import com.jiufeng.car.entity.ParkingLot;
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
public class ParkingLotController {

    @Autowired
    IParkingLotDao parkingLotDao;


    @RequestMapping
            (value = {"/save"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveParkingLot(@RequestHeader HttpHeaders requestHeader,
                                            @RequestBody String requestBody) throws Exception {
        ParkingLot parkingLot = JsonUtil.fromJson(requestBody, ParkingLot.class);
        parkingLotDao.save(parkingLot);
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping
            (value = {"/findall"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findAllParkingPlaces(@RequestHeader HttpHeaders requestHeader) throws Exception {
        List<ParkingLot> parkingLotList = parkingLotDao.findAll();
        ResponseEntity responseEntity = new ResponseEntity(parkingLotList, HttpStatus.OK);
        return responseEntity;
    }

}
