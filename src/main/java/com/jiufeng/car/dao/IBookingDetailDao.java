package com.jiufeng.car.dao;

import com.jiufeng.car.entity.BookingDetail;

import java.util.List;

/**
 * Created by chachen on 9/22/2017.
 */
public interface IBookingDetailDao {
    void save(BookingDetail bookingDetail);

    List<BookingDetail> findAllByParkingLotName(BookingDetail bookingDetail);

    List<BookingDetail> findAllByPhoneNumber(BookingDetail bookingDetail);

    int updateByCityName(BookingDetail bookingDetail);

}

