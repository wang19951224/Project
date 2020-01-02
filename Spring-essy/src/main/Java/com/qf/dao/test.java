package com.qf.dao;

import com.qf.entity.Account;
import com.qf.server.impl.AccountServerImpl;

import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Account> all = new AccountServerImpl().findAll();
        System.out.println(all.size());
    }
}
