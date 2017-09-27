package com.jiufeng.car.entity;

import java.io.Serializable;

public class Airport implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public Airport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
