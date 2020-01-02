package com.qf.service.impl;

import com.qf.dao.PersonDao;
import com.qf.entity.Man;
import com.qf.entity.Person;
import com.qf.service.PersonServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonServerImpl implements PersonServer {
    @Autowired
    private PersonDao personDao;

    public List<Person> findAll() {
        return personDao.findAll();
    }

    public Person login(Integer age) {
        return personDao.login(age);
    }
}
