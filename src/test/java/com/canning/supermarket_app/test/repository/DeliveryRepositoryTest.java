/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.repository;

import com.canning.supermarket_app.app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.Delivery;
import com.canning.supermarket_app.repository.DeliveryRepository;
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
public class DeliveryRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private DeliveryRepository deliveryRepository;
    
    public DeliveryRepositoryTest() {
    }

    @Test(priority = 1)
    public void createDelivery() {
         deliveryRepository = ctx.getBean(DeliveryRepository.class);
        
         Delivery delivery = new Delivery.Builder().delivery_needed("Yes").contact_number("021 585 969").build();
  
         deliveryRepository.save(delivery);
         
         id = delivery.getId();
         Assert.assertNotNull(delivery);
     }
    
    @Test(priority = 2, dependsOnMethods = "createDelivery")
    public void readDelivery() {
        deliveryRepository = ctx.getBean(DeliveryRepository.class);
        Delivery delivery = deliveryRepository.findOne(id);
        
        Assert.assertEquals(delivery.getDelivery_needed(), "Yes");
    }
    
     @Test(priority = 3, dependsOnMethods = "createDelivery")
     private void updateDelivery(){
        deliveryRepository = ctx.getBean(DeliveryRepository.class);
        Delivery delivery = deliveryRepository.findOne(id);
  
        Delivery updatedDelivery = new Delivery.Builder().Delivery(delivery).delivery_needed("Yes").contact_number("021 585 696").build();
         
        deliveryRepository.save(updatedDelivery);
              
        Delivery newDelivery = deliveryRepository.findOne(id);

        Assert.assertEquals(newDelivery.getDelivery_needed(), "Yes");
     }
     
    @Test(priority = 4, dependsOnMethods = "createDelivery")
    private void deleteDelivery(){
        deliveryRepository = ctx.getBean(DeliveryRepository.class);
        
        Delivery delivery = deliveryRepository.findOne(id);
        deliveryRepository.delete(delivery);
 
        Delivery deletedDelivery = deliveryRepository.findOne(id);

        Assert.assertNull(deletedDelivery);    
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
       /* deliveryRepository = ctx.getBean(DeliveryRepository.class);
        deliveryRepository.deleteAll();*/
    }
}