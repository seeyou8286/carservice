package com.jiufeng.car.controller;

import com.jiufeng.car.dao.IAccountDao;
import com.jiufeng.car.entity.Account;
import com.jiufeng.car.entity.Response;
import com.jiufeng.car.util.JsonUtil;
import com.jiufeng.car.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        Account queryResult = accountDao.findByPhoneNumber(account);
        Response response = new Response();
        if(queryResult==null)
        {
            accountDao.save(account);
            response.setStatus(StringUtil.SUCCESS);
        }else
        {
            response.setStatus(StringUtil.ERROR);
            response.setErrorMessage("Record exists.");
        }

        ResponseEntity responseEntity = new ResponseEntity(response, HttpStatus.OK);
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
        ResponseEntity responseEntity;
        if(account == null)
        {
            Response response = new Response(StringUtil.ERROR,"Record not found.");
            responseEntity = new ResponseEntity(response, HttpStatus.OK);
        }else
        {
            responseEntity= new ResponseEntity(account, HttpStatus.OK);
        }
        return responseEntity;
    }

}
