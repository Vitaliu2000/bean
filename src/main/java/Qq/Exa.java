package Qq;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.vit.curs.Address;
import ru.vit.curs.Company;
import ru.vit.curs.Config;

import static org.junit.Assert.assertEquals;

public class Exa {
    public static void main(String[] args) {
        System.out.println(1);
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company = context.getBean("company", Company.class);

        Address address = new Address("High Street", 1000);
        System.out.println(address.getNumber());

        assertEquals("High Street", company.getAddress().getStreet());
        assertEquals(1000, company.getAddress().getNumber());
    }
}
