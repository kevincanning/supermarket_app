/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.services;

import com.canning.supermarket_app.app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.repository.CustomerRepository;
import com.canning.supermarket_app.repository.DeliveryRepository;
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
 * @author Kevin
 */
public class DeliveryServiceTest {
     private static ApplicationContext ctx;
     private DeliveryRepository deliveryRepository;
     
     public DeliveryServiceTest(){
         
     }
      @Test
    public void getAllDeliveries() {
        deliveryRepository = ctx.getBean(DeliveryRepository.class);
        
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
       deliveryRepository = ctx.getBean(DeliveryRepository.class);
    }
}
