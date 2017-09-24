package com.jiufeng.car.dao;

import com.jiufeng.car.entity.Cities;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by chachen on 9/24/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CitiesDaoTest {

    @Autowired
    private CitiesDao citiesDao;

    @Test
    public void testSaveUser() throws Exception {
        List<String> list = new ArrayList();
        list.add("abc");
        Cities user=new Cities();
        user.setNames(list);
        citiesDao.saveCitieInfo(user);
    }

}