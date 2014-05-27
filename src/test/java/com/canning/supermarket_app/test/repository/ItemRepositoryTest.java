///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.canning.supermarket_app.test.repository;
//
//import com.canning.supermarket_app.app.conf.ConnectionConfig;
//import com.canning.supermarket_app.domain.Item;
//import com.canning.supermarket_app.repository.ItemRepository;
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
// * @author Kevin
// */
//public class ItemRepositoryTest {
//    public static ApplicationContext ctx;
//    private Long id;
//
//    private ItemRepository itemRepository;
//    
//    public ItemRepositoryTest() {
//    }
//    
//  /*  @Test(priority = 1, enabled = false)
//    public void createItem() {
//         itemRepository = ctx.getBean(ItemRepository.class);
//        
//         Item item = new Item.Builder().code("code01").amount_in_stock(100).price(250).build();
//
//         itemRepository.save(item);
//         
//         id = item.getId();
//         Assert.assertNotNull(item);         
//     }
//    
//    @Test(priority = 2, dependsOnMethods = "createItem", enabled = false)
//    public void readItem() {
//        itemRepository = ctx.getBean(ItemRepository.class);
//        Item item = itemRepository.findOne(id);
//        
//        Assert.assertEquals(item.getCode(), "code01");
//    }
//    
//     @Test(priority = 3, dependsOnMethods = "createItem", enabled = false)
//     private void updateItem(){
//        itemRepository = ctx.getBean(ItemRepository.class);
//        Item item = itemRepository.findOne(id);
//           
//        Item updatedItem = new Item.Builder().Item(item).code("code02").amount_in_stock(150).build();
//
//        itemRepository.save(updatedItem);
//              
//        Item newItem = itemRepository.findOne(id);
// 
//        Assert.assertEquals(newItem.getCode(), "code02");
//     }
//     
//     @Test(priority = 4, dependsOnMethods = "updateItem", enabled = false)
//     private void deleteItem(){
//        itemRepository = ctx.getBean(ItemRepository.class);
//    
//        Item item = itemRepository.findOne(id);
//        itemRepository.save(item);
//         
//        Item deletedItem = itemRepository.findOne(id);
//
//        Assert.assertNull(deletedItem); 
//    }
//*/
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
//       /*itemRepository = ctx.getBean(ItemRepository.class);
//        itemRepository.deleteAll();*/
//    }
//}