/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.presentation;

import com.canning.supermarket_app.domain.Item;
import com.canning.supermarket_app.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Kevin
 */
@Controller
@RequestMapping(value = "item/")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;
    
    @RequestMapping(value = "findAll")
    @ResponseBody    
     public List<Item> getAllCustomers() {
         Item item1 = new Item.Builder().price(250).amount_in_stock(1500).build();
         Item item2 = new Item.Builder().price(50).amount_in_stock(150).build();
         Item item3 = new Item.Builder().price(2150).amount_in_stock(15000).build();
         Item item4 = new Item.Builder().price(1001).amount_in_stock(5).build();
         Item item5 = new Item.Builder().price(1525).amount_in_stock(14).build();
         
         itemRepository.save(item1);
         itemRepository.save(item2);
         itemRepository.save(item3);
         itemRepository.save(item4);
         itemRepository.save(item5);
         
        return itemRepository.findAll() ;
    }
     
    @RequestMapping(value = "findById")
    @ResponseBody    
     public Item findById(Long id) {
         Item item1 = new Item.Builder().price(250).amount_in_stock(1500).build();
         Item item2 = new Item.Builder().price(50).amount_in_stock(150).build();
         Item item3 = new Item.Builder().price(2150).amount_in_stock(15000).build();
         Item item4 = new Item.Builder().price(1001).amount_in_stock(5).build();
         Item item5 = new Item.Builder().price(1525).amount_in_stock(14).build();
         
         itemRepository.save(item1);
         itemRepository.save(item2);
         itemRepository.save(item3);
         itemRepository.save(item4);
         itemRepository.save(item5);
            
         return itemRepository.findOne(id);
    }
     
    @RequestMapping(value = "create")
    @ResponseBody 
    public Item create(Item entity) {
        return itemRepository.save(entity);
    }
    
    @RequestMapping(value = "delete")
    @ResponseBody 
    public void delete(Item entity) {
        itemRepository.delete(entity);
    }
}
