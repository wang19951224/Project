package com.qf.server.impl;

import com.qf.dao.AccountDao;
import com.qf.entity.Account;
import com.qf.server.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountServerImpl")
public class AccountServerImpl implements AccountServer {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
