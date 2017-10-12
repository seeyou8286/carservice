package com.jiufeng.car.dao.impl;

import com.jiufeng.car.dao.IBookingDetailDao;
import com.jiufeng.car.entity.Account;
import com.jiufeng.car.entity.BookingDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chachen on 9/26/2017.
 */
@Component
public class BookingDetailDao implements IBookingDetailDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(BookingDetail bookingDetail) {
        mongoTemplate.save(bookingDetail);
    }

    @Override
    public List<BookingDetail> findAllByParkingLotName(BookingDetail bookingDetail) {
        Query query = new Query(Criteria.where("parkingLotName").is(bookingDetail.getParkingLotName()));
        List<BookingDetail> bookingDetails =  mongoTemplate.find(query, BookingDetail.class);
        if(bookingDetails  == null || bookingDetails.size() ==0)
        {
            return null;
        }
        return bookingDetails;
    }

    @Override
    public List<BookingDetail> findAllByPhoneNumber(BookingDetail bookingDetail) {
        Query query = new Query(Criteria.where("phoneNumber").is(bookingDetail.getPhoneNumber()));
        List<BookingDetail> bookingDetails =  mongoTemplate.find(query, BookingDetail.class);
        if(bookingDetails  == null || bookingDetails.size() ==0)
        {
            return null;
        }
        return bookingDetails;
    }

    @Override
    public int updateByCityName(BookingDetail bookingDetail) {
        return 0;
    }
}
