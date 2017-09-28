//package com.jiufeng.car.dao;
//
//import com.jiufeng.car.entity.ParkingLot;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by chachen on 9/24/2017.
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ParkingLotDaoTest {
//
//    @Autowired
//    private IParkingLotsDao citiesDao;
//
//    @Test
//    public void testSaveUser() throws Exception {
//        ParkingLot parkingLot = new ParkingLot();
//        parkingLot.setCityName("深圳");
//        List<String> airport = new ArrayList();
//        airport.add("深圳宝安");
//        parkingLot.setAirportName(airport);
//        List<String> placeNames = new ArrayList<>();
//        placeNames.add("深圳永琴停车场");
//        placeNames.add("深圳大宝停车场");
//        parkingLot.setPlaceName(placeNames);
//        citiesDao.save(parkingLot);
//    }
//
//    @Test
//    public void testUpdateUser() throws Exception {
//        ParkingLot parkingLot = new ParkingLot();
//        parkingLot.setCityName("深圳");
//        List<String> airport = new ArrayList();
//        airport.add("深圳宝安");
//        parkingLot.setAirportName(airport);
//        List<String> placeNames = new ArrayList<>();
//        placeNames.add("深圳特殊停车场");
//        placeNames.add("深圳很棒停车场");
//        parkingLot.setPlaceName(placeNames);
//        citiesDao.updateByCityName(parkingLot);
//    }
//
//    @Test
//    public void findAll()
//    {
//        List<ParkingLot> parkingLots = citiesDao.findAll();
//        System.out.println(parkingLots);
//    }
//
//
//
//
//}