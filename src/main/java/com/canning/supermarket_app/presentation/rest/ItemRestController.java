/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.presentation.rest;

import com.canning.supermarket_app.domain.Item;
import com.canning.supermarket_app.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Kevin
 */
@Controller
public class ItemRestController {
    @Autowired
    private ItemRepository itemRepository;
    
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Item item) {
        System.out.println(" Create the Called ");
        System.out.println("Item: " + item);
        itemRepository.save(item);
         return "Created item";
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody Item item) {
        System.out.println(" Update Called ");
        System.out.println("Item: " + item);
        
        return "Updated item";
    }

    @RequestMapping(value = "item/{id}")
    @ResponseBody
    public Item getItem(@PathVariable Long id) {
        System.out.println(" ID called ");
        return this.itemRepository.findOne(id);
    }

    @RequestMapping(value = "items")
    @ResponseBody
    public List<Item> getItems() {
        System.out.println("The Customers ");
        return this.itemRepository.findAll();
    }

    @RequestMapping(value = "itemname/{name}")
    @ResponseBody
    public Item getItemName(@PathVariable String id) {
        System.out.println("The Item name");
        return null;
    }
}
