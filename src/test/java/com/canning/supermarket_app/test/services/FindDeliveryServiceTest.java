///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.canning.supermarket_app.test.services;
//
//import com.canning.supermarket_app.app.conf.ConnectionConfig;
//import com.canning.supermarket_app.domain.Delivery;
//import com.canning.supermarket_app.repository.DeliveryRepository;
//import com.canning.supermarket_app.services.DeliveryService;
//import java.util.List;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//public class FindDeliveryServiceTest {
//    private static ApplicationContext ctx;
//    private DeliveryRepository deliveryRepository;
//    private DeliveryService deliveryService;
//    
//    public FindDeliveryServiceTest() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    @Test(enabled = false)
//    public void getAllDeliveries() {
//        deliveryRepository = ctx.getBean(DeliveryRepository.class);
//        deliveryService = ctx.getBean(DeliveryService.class);
//        
//        Delivery delivery1 = new Delivery.Builder().contact_number("021 555 5555").delivery_needed("Yes").build();
//        Delivery delivery2 = new Delivery.Builder().contact_number("N/A").delivery_needed("No").build();
//        
//        deliveryRepository.save(delivery1);
//        deliveryRepository.save(delivery2);
//        
//        List<Delivery> deliveries = deliveryService.findAll();
//        System.out.println("Deliveries: " + deliveries);
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
//        deliveryRepository = ctx.getBean(DeliveryRepository.class);
//        deliveryRepository.deleteAll();
//    }
//}
