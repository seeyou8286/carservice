package com.jiufeng.car.dao.impl;

import com.jiufeng.car.dao.CitiesDao;
import com.jiufeng.car.entity.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * Created by chachen on 9/22/2017.
 */
@Component
public class CitiesDaoImpl implements CitiesDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveCitieInfo(Cities cities) {
        mongoTemplate.save(cities);
    }

    @Override
    public void deleteUserById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Cities.class);
    }
}
