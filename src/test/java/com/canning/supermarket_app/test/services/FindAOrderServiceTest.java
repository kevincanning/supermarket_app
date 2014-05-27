///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.canning.supermarket_app.test.services;
//
//import com.canning.supermarket_app.app.conf.ConnectionConfig;
//import com.canning.supermarket_app.domain.Orders;
//import com.canning.supermarket_app.repository.OrderRepository;
//import com.canning.supermarket_app.services.OrderService;
//import java.util.List;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
///**
// *
// * @author Kevin Canning
// */
//public class FindAOrderServiceTest {
//    private static ApplicationContext ctx;
//    private OrderRepository orderRepository;
//    private OrderService orderService;
//    
//    public FindAOrderServiceTest() {
//    }
//
//    @Test(enabled = false)
//    public void getAOrder() {
//        orderRepository = ctx.getBean(OrderRepository.class);
//        orderService = ctx.getBean(OrderService.class);
//        
//        Orders order1 = new Orders.Builder().order_date("15 May 2014").order_number("order01").build();
//        Orders order2 = new Orders.Builder().order_date("14 May 2014").order_number("order03").build();
//
//        orderRepository.save(order1);
//        orderRepository.save(order2);
//        
//        List<Orders> orders = orderService.findAll();
//
//        Assert.assertEquals(orders, orders);
//    }
//
//    @BeforeClass
//    public static void setUpClass() throws Exception {
//        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    @BeforeMethod
//    public void setUpMethod() throws Exception {
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//        orderRepository = ctx.getBean(OrderRepository.class);
//        orderRepository.deleteAll();
//    }
//}
