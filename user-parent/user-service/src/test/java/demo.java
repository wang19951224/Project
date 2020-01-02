import com.qf.entity.Person;
import com.qf.service.impl.PersonServerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class demo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContest.xml");
        PersonServerImpl psi = (PersonServerImpl)cac.getBean("personServerImpl");
        List<Person> all = psi.findAll();
        for(Person a:all){
            System.out.println(a);
        }
    }
}
