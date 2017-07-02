package info.henryk.aop;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by henryknowakowski on 01.07.2017.
 */
public class Main {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        CustomerRepository customerrepository = context.getBean("customerrepository", CustomerRepository.class);

        Customer customer1 = new Customer("Janek");
        Customer customer2 = new Customer(null);

        try {
            customerrepository.addCustomer(customer1);
            customerrepository.addCustomer(customer2);
        } catch (Exception e) {
            System.out.println("null exception");
            //e.printStackTrace();
        }

    }
}
