package com.jiufeng.car.dao.impl;

import com.jiufeng.car.dao.IAccountDao;
import com.jiufeng.car.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDaoTest {
    @Autowired
    private IAccountDao iAccountDao;


    @Test
    public void testSaveAccount() {
        Account account = new Account("18682379493","Test1234");
        iAccountDao.save(account);
    }


    @Test
    public void testFindOneSuccess() {
        Account account = new Account("18682379493");
        account = iAccountDao.findByPhoneNumber(account);
        System.out.println(account.getPassword());
    }

}