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

        System.out.println(customerrepository.getCustomerName(23L));
    }
}
