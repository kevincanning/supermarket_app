///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.canning.supermarket_app.presentation.rest;
//
//import com.canning.supermarket_app.domain.Delivery;
//import com.canning.supermarket_app.presentation.DeliveryController;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// *
// * @author Kevin
// */
//@Controller
//public class DeliveryRestController {
//    @Autowired
//    private DeliveryController deliveryController;
//    
//    @RequestMapping(value = "create")
//    @ResponseBody
//    public String create(@RequestBody Delivery delivery) {
//        System.out.println(" Create the Called ");
//        System.out.println("Delivery: " + delivery);
//        deliveryController.create();
//         return "Created delivery";
//    }
//
//    @RequestMapping(value = "update")
//    @ResponseBody
//    public String update(@RequestBody Delivery delivery) {
//        System.out.println(" Update Called ");
//        System.out.println("Delivery: " + delivery);
//        
//        return "Updated delivery";
//    }
//
//    @RequestMapping(value = "delivery/{id}")
//    @ResponseBody
//    public Delivery getDelivery(@PathVariable Long id) {
//        System.out.println(" ID called ");
//        return this.deliveryController.findById(id);
//    }
//
//    @RequestMapping(value = "deliveries")
//    @ResponseBody
//    public List<Delivery> getDeliveries() {
//        System.out.println("The Deliveries: ");
//        return this.deliveryController.getAllDeliveries();
//    }
//
//    @RequestMapping(value = "deliveryname/{name}")
//    @ResponseBody
//    public Delivery getDeliveryByName(@PathVariable String id) {
//        System.out.println("The Delivery name");
//        return null;
//    }
//}
