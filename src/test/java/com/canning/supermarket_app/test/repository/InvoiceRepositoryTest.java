///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.canning.supermarket_app.test.repository;
//
//import com.canning.supermarket_app.app.conf.ConnectionConfig;
//import com.canning.supermarket_app.domain.Invoice;
//import com.canning.supermarket_app.repository.InvoiceRepository;
//import java.util.Date;
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
//public class InvoiceRepositoryTest {
//    public static ApplicationContext ctx;
//    private Long id;
//
//    private InvoiceRepository invoiceRepository;
//    
//    public InvoiceRepositoryTest() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//  /*  @Test(priority = 1, enabled = false)
//    public void createInvoice() {
//         invoiceRepository = ctx.getBean(InvoiceRepository.class);
//        
//         Invoice invoice = new Invoice.Builder().invoice_date(new Date()).total(500).build();
//
//         invoiceRepository.save(invoice);
//         
//         id = invoice.getId();
//         Assert.assertNotNull(invoice);
//     }
//    
//    @Test(priority = 2, dependsOnMethods = "createInvoice", enabled = false)
//    public void readInvoice() {
//        invoiceRepository = ctx.getBean(InvoiceRepository.class);
//        Invoice invoice = invoiceRepository.findOne(id);
//        
//        Assert.assertEquals(invoice.getTotal(), 500);
//    }
//    
//     @Test(priority = 3, dependsOnMethods = "createInvoice", enabled = false)
//     private void updateInvoice(){
//        invoiceRepository = ctx.getBean(InvoiceRepository.class);
//        Invoice invoice = invoiceRepository.findOne(id);
//            
//         Invoice updatedInvoice = new Invoice.Builder().Invoice(invoice).invoice_date(new Date()).total(1500).build();
//
//         invoiceRepository.save(updatedInvoice);
//              
//        Invoice newInvoice = invoiceRepository.findOne(id);
// 
//        Assert.assertEquals(newInvoice.getTotal(), 1500);
//     }
//     
//     @Test(priority = 4, dependsOnMethods = "updateInvoice", enabled = false)
//     private void deleteInvoice(){
//        invoiceRepository = ctx.getBean(InvoiceRepository.class);
//    
//        Invoice invoice = invoiceRepository.findOne(id);
//        invoiceRepository.delete(invoice);
// 
//        Invoice deletedInvoice = invoiceRepository.findOne(id);
//
//        Assert.assertNull(deletedInvoice);   
//    }*/
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
//       /* invoiceRepository = ctx.getBean(InvoiceRepository.class);
//        invoiceRepository.deleteAll();*/
//    }
//}