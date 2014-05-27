/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.presentation;

import com.canning.supermarket_app.domain.Delivery;
import com.canning.supermarket_app.repository.DeliveryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Kevin
 */
@Controller
@RequestMapping(value = "deilvery/")
public class DeliveryController {
    @Autowired
    private DeliveryRepository deliveryRepository;
    
    @RequestMapping(value = "findAll")
    @ResponseBody    
     public List<Delivery> getAllDeliveries() {
         Delivery delivery1 = new Delivery.Builder().delivery_needed("Yes").contact_number("0115588659").build();
         Delivery delivery2 = new Delivery.Builder().delivery_needed("No").contact_number("N/A").build();
         Delivery delivery3 = new Delivery.Builder().delivery_needed("Yes").contact_number("0115595459").build();
         Delivery delivery4 = new Delivery.Builder().delivery_needed("No").contact_number("None").build();
         Delivery delivery5 = new Delivery.Builder().delivery_needed("Yes").contact_number("0215849635").build();
         
         deliveryRepository.save(delivery1);
         deliveryRepository.save(delivery2);
         deliveryRepository.save(delivery3);
         deliveryRepository.save(delivery4);
         deliveryRepository.save(delivery5);
         
         return deliveryRepository.findAll();
     }
     
    @RequestMapping(value = "findById", method = RequestMethod.GET)
    @ResponseBody
    public Delivery findById(Long id) {
         Delivery delivery1 = new Delivery.Builder().delivery_needed("Yes").contact_number("0115588659").build();
         Delivery delivery2 = new Delivery.Builder().delivery_needed("No").contact_number("N/A").build();
         Delivery delivery3 = new Delivery.Builder().delivery_needed("Yes").contact_number("0115595459").build();
         Delivery delivery4 = new Delivery.Builder().delivery_needed("No").contact_number("None").build();
         Delivery delivery5 = new Delivery.Builder().delivery_needed("Yes").contact_number("0215849635").build();
         
         deliveryRepository.save(delivery1);
         deliveryRepository.save(delivery2);
         deliveryRepository.save(delivery3);
         deliveryRepository.save(delivery4);
         deliveryRepository.save(delivery5);
         
         return deliveryRepository.findOne(id);
    }
    
    @RequestMapping(value = "create")
    @ResponseBody
    public void create() {
         Delivery delivery1 = new Delivery.Builder().delivery_needed("Yes").contact_number("0115588659").build();
         Delivery delivery2 = new Delivery.Builder().delivery_needed("No").contact_number("N/A").build();
         Delivery delivery3 = new Delivery.Builder().delivery_needed("Yes").contact_number("0115595459").build();
         Delivery delivery4 = new Delivery.Builder().delivery_needed("No").contact_number("None").build();
         Delivery delivery5 = new Delivery.Builder().delivery_needed("Yes").contact_number("0215849635").build();
         
         deliveryRepository.save(delivery1);
         deliveryRepository.save(delivery2);
         deliveryRepository.save(delivery3);
         deliveryRepository.save(delivery4);
         deliveryRepository.save(delivery5);
    }
}
