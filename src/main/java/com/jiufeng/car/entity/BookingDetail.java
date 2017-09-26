package com.jiufeng.car.entity;

import lombok.Data;
import org.joda.time.DateTime;

/**
 * Created by chachen on 9/26/2017.
 */
@Data
public class BookingDetail {
    private String phoneNumber; //Compulsory
    private DateTime startTime; //Compulsory
    private DateTime endTime;   //Compulsory
    private String plateNumber; //Compulsory
    private Integer peopleCounts;
    private String carCounts;
    private String placeName;  //Compulsory


}
