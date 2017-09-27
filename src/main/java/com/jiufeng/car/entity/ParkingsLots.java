package com.jiufeng.car.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by summer on 2017/5/5.
 */
@Data
public class ParkingsLots implements Serializable {
        private static final long serialVersionUID = -3258839839160856613L;
        private String airportName;
        private String cityName;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private List<ParkingLot> parkingLot;

        public ParkingsLots() {
        }
}
