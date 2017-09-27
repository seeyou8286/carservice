package com.jiufeng.car.controller;

import com.jiufeng.car.dao.IAirportDao;
import com.jiufeng.car.entity.Airport;
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
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    IAirportDao airportDao;


    @RequestMapping
            (value = {"/save"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveParkingLot(@RequestHeader HttpHeaders requestHeader,
                                            @RequestBody String requestBody) throws Exception {
        Airport airport = JsonUtil.fromJson(requestBody, Airport.class);
        airportDao.save(airport);
        Response response = new Response();
        response.setStatus(StringUtil.SUCCESS);
        ResponseEntity responseEntity = new ResponseEntity(response,HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping
            (value = {"/findall"},
                    method = {RequestMethod.GET},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findAllParkingPlaces(@RequestHeader HttpHeaders requestHeader) throws Exception {
        List<Airport> airportList = airportDao.findAll();
        ResponseEntity responseEntity = new ResponseEntity(airportList, HttpStatus.OK);
        return responseEntity;
    }

}
