package com.qf.dao;

import com.qf.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();

}

