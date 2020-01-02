package com.qf.test;

import com.qf.dao.PersonDao;
import com.qf.dao.PersonDaoImpl;
import com.qf.entity.Man;
import com.qf.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("applicationContest.xml");
        PersonDaoImpl ac=(PersonDaoImpl)cpa.getBean("personDaoImpl");
        Logger log=Logger.getLogger("Demo.class");
        Person person = new Person();
        person.setAge(24);
        person.setName("玉川");
        Person person1 = ac.getPersonById(person);
    }
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContest.xml");
        SqlSessionFactory ssf = (SqlSessionFactory)ac.getBean("sqlSessionFaction");
        SqlSession ss = ssf.openSession();
        Person person = ss.getMapper(PersonDao.class).getPersonById(new Person("玉川",24));
        System.out.println(person);


    }
}
