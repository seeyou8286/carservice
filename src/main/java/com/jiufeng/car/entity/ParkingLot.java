package com.jiufeng.car.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ParkingLot implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private String name;
    private String distance;
    private String rate;
    private Integer dayPrice;
    private String airportName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cityName;
}
