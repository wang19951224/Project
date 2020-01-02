package com.qf.service;

import com.qf.entity.Man;
import com.qf.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonServer {
    public List<Person> findAll();
    public Person login (Integer age);
}
