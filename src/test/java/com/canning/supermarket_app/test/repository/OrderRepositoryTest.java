/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.repository;

import com.canning.supermarket_app.app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.Orders;
import com.canning.supermarket_app.repository.OrderRepository;
import com.canning.supermarket_app.services.OrderService;
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
public class OrderRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private OrderRepository orderRepository;
    
    public OrderRepositoryTest(){
    }
    
    @Test(priority = 1)
    public void createOrder() {
         orderRepository = ctx.getBean(OrderRepository.class);
        
        Orders orders = new Orders.Builder().order_date("19 May 2014").order_number("order01").build();

         orderRepository.save(orders);
         
         id = orders.getId();
         Assert.assertNotNull(orders);         
     }
    
    @Test(priority = 2, dependsOnMethods = "createOrder")
    public void readOrder() {
        orderRepository = ctx.getBean(OrderRepository.class);
        Orders orders = orderRepository.findOne(id);
        
        Assert.assertEquals(orders.getOrder_number(), "order01");
    }
    
     @Test(priority = 3, dependsOnMethods = "createOrder")
     private void updateOrder(){
        orderRepository = ctx.getBean(OrderRepository.class);
        Orders orders = orderRepository.findOne(id);
        
        Orders updatedOrder = new Orders.Builder().Orders(orders).order_date("19 May 2014").order_number("order02").build();

        orderRepository.save(updatedOrder);
             
        Orders newOrder = orderRepository.findOne(id);
      
        Assert.assertEquals(newOrder.getOrder_number(), "order02");
     }
     
     @Test(priority = 4, dependsOnMethods = "updateOrder")
     private void deleteOrder(){
            orderRepository = ctx.getBean(OrderRepository.class);
            
            Orders order = orderRepository.findOne(id);
            orderRepository.save(order);
 
            Orders deletedOrders = orderRepository.findOne(id);
        
            Assert.assertNull(deletedOrders); 
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
        /*orderRepository = ctx.getBean(OrderRepository.class);
        orderRepository.deleteAll();*/
    }
}