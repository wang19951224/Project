package com.qf.dao;

import com.qf.entity.Man;
import com.qf.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonDaoImpl implements PersonDao{
    @Autowired
    private PersonDao personDao;
    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person login(Integer age) {
        return personDao.login(age);
    }

    @Override
    public Person getPersonById(Person person) {
        return personDao.getPersonById(person);
    }

}
