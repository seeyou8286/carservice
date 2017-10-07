package com.jiufeng.car.controller;

import com.jiufeng.car.dao.IParkingLotDao;
import com.jiufeng.car.entity.ParkingLot;
import com.jiufeng.car.entity.Response;
import com.jiufeng.car.util.JsonUtil;
import com.jiufeng.car.util.StringUtil;
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
    IParkingLotDao parkingLotsDao;


    @RequestMapping
            (value = {"/save"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveParkingLot(@RequestHeader HttpHeaders requestHeader,
                                            @RequestBody String requestBody) throws Exception {
        ParkingLot parkingLot = JsonUtil.fromJson(requestBody, ParkingLot.class);
        parkingLotsDao.save(parkingLot);
        Response response = new Response();
        response.setStatus(StringUtil.SUCCESS);
        ResponseEntity responseEntity = new ResponseEntity(response,HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping
            (value = {"/find"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findByAirportName(@RequestHeader HttpHeaders requestHeader,
                                                 @RequestBody String requestBody) throws Exception {
        ParkingLot parkingLot = JsonUtil.fromJson(requestBody, ParkingLot.class);
        List<ParkingLot> parkingsLots = parkingLotsDao.findByAirportName(parkingLot);
        ResponseEntity responseEntity;
        if(parkingsLots == null)
        {
            Response response = new Response(StringUtil.ERROR,"Record not found.");
            responseEntity = new ResponseEntity(response, HttpStatus.OK);
        }else
        {
            responseEntity= new ResponseEntity(parkingsLots, HttpStatus.OK);
        }
        return responseEntity;
    }

}
