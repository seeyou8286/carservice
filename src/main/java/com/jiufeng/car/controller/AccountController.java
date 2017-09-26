package com.jiufeng.car.controller;

import com.jiufeng.car.dao.IAccountDao;
import com.jiufeng.car.dao.IParkingLotDao;
import com.jiufeng.car.entity.Account;
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
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountDao accountDao;


    @RequestMapping
            (value = {"/save"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveParkingLot(@RequestHeader HttpHeaders requestHeader,
                                            @RequestBody String requestBody) throws Exception {
        Account account = JsonUtil.fromJson(requestBody, Account.class);
        accountDao.save(account);
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping
            (value = {"/find"},
                    method = {RequestMethod.POST},
                    produces = {MediaType.APPLICATION_JSON_VALUE},
                    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findByPhoneNumber(@RequestHeader HttpHeaders requestHeader,
                                               @RequestBody String requestBody) throws Exception {
        Account account = JsonUtil.fromJson(requestBody, Account.class);
        account = accountDao.findByPhoneNumber(account);
        ResponseEntity responseEntity = new ResponseEntity(account, HttpStatus.OK);
        return responseEntity;
    }

}
