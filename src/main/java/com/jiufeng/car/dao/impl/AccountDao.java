package com.jiufeng.car.dao.impl;

import com.jiufeng.car.dao.IAccountDao;
import com.jiufeng.car.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDao implements IAccountDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Account account) {
        mongoTemplate.save(account);
    }

    @Override
    public Account findByPhoneNumber(Account account) {
        Query query = new Query(Criteria.where("phoneNumber").is(account.getPhoneNumber()));
        List<Account> accountList =  mongoTemplate.find(query, Account.class);
        if(accountList  == null || accountList.size() ==0)
        {
            return null;
        }
        return accountList.get(0);
    }
}
