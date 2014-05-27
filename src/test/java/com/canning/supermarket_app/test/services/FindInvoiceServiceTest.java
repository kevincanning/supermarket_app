///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.canning.supermarket_app.test.services;
//
//import com.canning.supermarket_app.app.conf.ConnectionConfig;
//import com.canning.supermarket_app.domain.Invoice;
//import com.canning.supermarket_app.repository.InvoiceRepository;
//import com.canning.supermarket_app.services.InvoiceService;
//import java.util.Date;
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
//public class FindInvoiceServiceTest {
//    private static ApplicationContext ctx;
//    private InvoiceRepository invoiceRepository;
//    private InvoiceService invoiceService;
//    
//    public FindInvoiceServiceTest() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    @Test(enabled = false)
//    public void findAInvoice() {
//        invoiceRepository = ctx.getBean(InvoiceRepository.class);
//        invoiceService = ctx.getBean(InvoiceService.class);
//        
//        Invoice invoice1 = new Invoice.Builder().invoice_date(new Date()).total(1500).build();
//        
//        invoiceRepository.save(invoice1);
//        
//        Invoice invoice = (Invoice) invoiceService.find(Long.MIN_VALUE);
//        System.out.println("Invoice: " + invoice);
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
//        invoiceRepository = ctx.getBean(InvoiceRepository.class);
//        invoiceRepository.deleteAll();
//    }
//}
