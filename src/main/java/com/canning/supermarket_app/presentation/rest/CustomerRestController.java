/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.presentation.rest;

import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.presentation.CustomerController;
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
public class CustomerRestController {
    @Autowired
    private CustomerController customerController;
    
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Customer customer) {
        System.out.println(" Create the Called ");
        System.out.println("Customer: " + customer);
        customerController.create(customer);
         return "Created customer";
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody Customer customer) {
        System.out.println(" Update Called ");
        System.out.println("Customer: " + customer);
        //set update mnethod
        
        return "Updated customer";
    }

    @RequestMapping(value = "customer/{id}")
    @ResponseBody
    public Customer getCustomer(@PathVariable Long id) {
        System.out.println(" ID called ");
        return this.customerController.findById(id);
    }

    @RequestMapping(value = "customers")
    @ResponseBody
    public List<Customer> getCustomers() {
        System.out.println("The Customers ");
        return this.customerController.getAllCustomers(null);
    }

    @RequestMapping(value = "customername/{name}")
    @ResponseBody
    public Customer getCustomerByName(@PathVariable String id) {
        System.out.println("The Customer name");
        return null;
    }
}
