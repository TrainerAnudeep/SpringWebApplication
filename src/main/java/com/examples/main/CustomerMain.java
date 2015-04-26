package com.examples.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.dao.CustomerDao;
import com.examples.model.Customer;

import java.util.List;


public class CustomerMain {
 
    public static void main(String[] args) {
 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         
        CustomerDao custDao = context.getBean(CustomerDao.class);
         
        Customer cust = new Customer();
        cust.setName("Anudeep");
        cust.setId("anudeep12345");
        cust.setPassword("1234");
        
        custDao.save(cust);
         
        System.out.println("Customer::"+cust);
         
        List<Customer> list = custDao.list();
         
        for(Customer c : list){
            System.out.println("Customer List::"+c);
        }
        //close resources
        context.close();    
    }
}
