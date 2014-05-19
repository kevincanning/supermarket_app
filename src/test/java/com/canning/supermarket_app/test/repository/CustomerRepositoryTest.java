/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.repository;

import com.canning.supermarket_app.app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.ContactDetails;
import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.domain.Name;
import com.canning.supermarket_app.repository.CustomerRepository;
import com.canning.supermarket_app.services.CustomerService;
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
public class CustomerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    private CustomerRepository customerRepository;
    
    public CustomerRepositoryTest() {
    }

    @Test(priority = 1)
    public void createCustomer() {
        customerRepository = ctx.getBean(CustomerRepository.class);

        Name name = new Name();
        name.setFirst_name("Kev");
        name.setLast_name("Canning");

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setCell_number("082 363 363");
        contactDetails.setEmail_address("info@canning.co.za");
        contactDetails.setHome_number(null);

        Customer customer = new Customer.Builder().customer_Number("001").name(name).contactDetails(contactDetails).build();
        customerRepository.save(customer);  

        id = customer.getId();
        Assert.assertNotNull(customer);
     }
    
    @Test(priority = 2, dependsOnMethods = "createCustomer")
    public void readCustomer() {
        customerRepository = ctx.getBean(CustomerRepository.class);
        Customer customer = customerRepository.findOne(id);
        
        System.out.println("Customer: " + customer);
        
        //TODO: Add assert for null customer.
        Assert.assertEquals(customer.getCustomer_number(), "001");
    }
    
     @Test(priority = 3, dependsOnMethods = "createCustomer")
     private void updateCustomer(){
        customerRepository = ctx.getBean(CustomerRepository.class);
        Customer customer = customerRepository.findOne(id);
        
        Name name = new Name();
        name.setFirst_name("Kevin");
        name.setLast_name("Canning");

        Customer updatedCustomer = new Customer.Builder().customer(customer).customer_Number("002").name(name).build();
        
        //TODO: Add assert for null updatedCustomer.
        
        customerRepository.save(updatedCustomer);

        Customer newCustomer = customerRepository.findOne(id);
        
        System.out.println("New Customer: " + newCustomer);
        
        //TODO: Add assert for null newCustomer.
        Assert.assertEquals(newCustomer.getCustomer_number(), "002");
     }
     
    @Test(priority = 4, dependsOnMethods = "createCustomer")
    private void deleteCustomer(){
        customerRepository = ctx.getBean(CustomerRepository.class);
        
        Customer customer = customerRepository.findOne(id);
        customerRepository.delete(customer);

        Customer deletedCustomer = customerRepository.findOne(id);

        Assert.assertNull(deletedCustomer);
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
       //customerRepository = ctx.getBean(CustomerRepository.class);
       //customerRepository.deleteAll();
    }
}