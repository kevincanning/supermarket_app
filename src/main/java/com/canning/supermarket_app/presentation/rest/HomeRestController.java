/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.presentation.rest;

import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.domain.Name;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Kevin
 */
@Controller
@RequestMapping(value = "/home")
public class HomeRestController {
    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getTest(){
        List<Customer> customers = new ArrayList<>();
        Name name1 = new Name();
        name1.setFirst_name("Kevin");
        name1.setLast_name("Canning");
        Customer c1 = new Customer.Builder().customer_Number("customer01").name(name1).build();
       
        Name name2 = new Name();
        name2.setFirst_name("Chris");
        name2.setLast_name("Canning");
        Customer c2 = new Customer.Builder().customer_Number("customer02").name(name2).build();
        
        customers.add(c1);
        customers.add(c2);
        
        return customers;
    }   
}
