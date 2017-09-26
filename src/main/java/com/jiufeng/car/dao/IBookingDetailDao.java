package com.jiufeng.car.dao;

import com.jiufeng.car.entity.BookingDetail;
import com.jiufeng.car.entity.ParkingLot;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IBookingDetailDao {
    void save(BookingDetail bookingDetail);

    List<BookingDetail> findAll();

    int updateByCityName(BookingDetail bookingDetail);

}

