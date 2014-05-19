/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.test.services;

import com.canning.supermarket_app.app.conf.ConnectionConfig;
import com.canning.supermarket_app.domain.Item;
import com.canning.supermarket_app.repository.ItemRepository;
import com.canning.supermarket_app.services.ItemService;
import java.util.List;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kevin Canning
 */
public class FindItemServiceTest {
    private static ApplicationContext ctx;
    private ItemRepository itemRepository;
    private ItemService itemService;
    
    public FindItemServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getAllItems() {
        itemRepository = ctx.getBean(ItemRepository.class);
        itemService = ctx.getBean(ItemService.class);
        
        Item item1 = new Item.Builder().price(500).amount_in_stock(25).build();
        Item item2 = new Item.Builder().price(1000).amount_in_stock(5).build();
        
        itemRepository.save(item1);
        itemRepository.save(item2);
        
        List<Item> items = itemService.getAllItems();
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
        itemRepository = ctx.getBean(ItemRepository.class);
        itemRepository.deleteAll();
    }
}
