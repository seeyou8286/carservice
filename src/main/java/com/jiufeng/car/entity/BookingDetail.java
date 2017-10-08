package com.jiufeng.car.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by chachen on 9/26/2017.
 */
@Data
@NoArgsConstructor
public class BookingDetail implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private String phoneNumber; //Compulsory
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private DateTime startTime; //Compulsory
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private DateTime endTime;   //Compulsory
    private String plateNumber; //Compulsory
    private Integer peopleCounts;
    private String carCounts;
    private String placeName;  //Compulsory
    private Integer totalPrice;
    private Integer bookingFee;

    public BookingDetail(String phoneNumber, DateTime startTime, DateTime endTime, String plateNumber, Integer peopleCounts, String carCounts, String placeName, Integer totalPrice, Integer bookingFee) {
        this.phoneNumber = phoneNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.plateNumber = plateNumber;
        this.peopleCounts = peopleCounts;
        this.carCounts = carCounts;
        this.placeName = placeName;
        this.totalPrice = totalPrice;
        this.bookingFee = bookingFee;
    }
}
