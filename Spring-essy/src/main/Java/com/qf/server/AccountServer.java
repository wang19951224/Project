package com.qf.server;

import com.qf.dao.AccountDao;
import com.qf.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("accountServer")
public interface AccountServer  {
    public List<Account> findAll();

}
