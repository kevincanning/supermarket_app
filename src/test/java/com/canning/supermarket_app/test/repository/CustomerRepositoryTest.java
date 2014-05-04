/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.repository;

import com.canning.supermarket_app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.repository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kevin Canning
 */
public class CustomerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private CustomerRepository custRepo;
    
    public CustomerRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
        /* custRepo = ctx.getBean(CustomerRepository.class);
         Customer cust = new Customer();
         cust.setName(null);
         custRepo.save(cust);*/
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
    }
}
