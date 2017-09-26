package com.jiufeng.car.entity;

import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by chachen on 9/26/2017.
 */
@Data
public class BookingDetail implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private String phoneNumber; //Compulsory
    private DateTime startTime; //Compulsory
    private DateTime endTime;   //Compulsory
    private String plateNumber; //Compulsory
    private Integer peopleCounts;
    private String carCounts;
    private String placeName;  //Compulsory

    public BookingDetail() {
    }

}
