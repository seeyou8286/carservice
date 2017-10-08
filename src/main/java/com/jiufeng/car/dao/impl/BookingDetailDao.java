package com.jiufeng.car.dao.impl;

import com.jiufeng.car.dao.IBookingDetailDao;
import com.jiufeng.car.entity.BookingDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
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
    public List<BookingDetail> findAll() {
        return null;
    }

    @Override
    public int updateByCityName(BookingDetail bookingDetail) {
        return 0;
    }
}
