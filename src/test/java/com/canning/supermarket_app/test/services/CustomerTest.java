/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.services;

import com.canning.supermarket_app.app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.repository.CustomerRepository;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kevin Canning
 */
public class CustomerTest {
     private static ApplicationContext ctx;
    private CustomerRepository customerRepository;

    public CustomerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getAllCustomers() {
        customerRepository = ctx.getBean(CustomerRepository.class);
        
        Customer c1 = new Customer.Builder().customer_Number(null).build();
        Customer c2 = new Customer.Builder().name(null, null).build();
       
        customerRepository.save(c1);
        customerRepository.save(c2);

        List<Customer> customers = customerRepository.findAll();

        Assert.assertNotNull(customers);
}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       customerRepository = ctx.getBean(CustomerRepository.class);
    }
}
