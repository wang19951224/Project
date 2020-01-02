package com.qf.dao;

import com.qf.entity.Man;
import com.qf.entity.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonDao {
    @Select("select * from person")
    public List<Person> findAll();


    public Person login(Integer age);
    public Person getPersonById( Person person);
}
