package com.jiufeng.car.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by summer on 2017/5/5.
 */
@Data
public class Cities implements Serializable {
        private static final long serialVersionUID = -3258839839160856613L;
        private List<String> names;
}
