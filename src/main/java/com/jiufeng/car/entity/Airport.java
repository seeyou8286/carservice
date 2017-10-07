package com.jiufeng.car.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Airport implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private String name;

    public Airport(String name) {
        this.name = name;
    }
}
