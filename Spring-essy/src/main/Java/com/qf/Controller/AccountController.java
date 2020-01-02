package com.qf.Controller;

import com.qf.entity.Account;
import com.qf.server.AccountServer;
import com.qf.server.impl.AccountServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AccountController<AccountService, AccountServiceImpl> {
    @Autowired
    private AccountServerImpl accountServerImpl;

    @RequestMapping("/findAll")
    public List<Account> findAll(){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountServerImpl.findAll();
        return list;
    }

}
