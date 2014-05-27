/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.presentation;

import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.domain.Name;
import com.canning.supermarket_app.repository.CustomerRepository;
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
@RequestMapping(value = "customer/")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    
    @RequestMapping(value = "all", method = RequestMethod.GET)
    @ResponseBody    
     public List<Customer> getAllCustomers(Customer customer) {
         Name name1 = new Name();
         name1.setFirst_name("Bob");
         name1.setLast_name("Jones");
         Customer c1 = new Customer.Builder().customer_Number("customer01").name(name1).build();
         
         Name name2 = new Name();
         name2.setFirst_name("Kevin");
         name2.setLast_name("Canning");
         Customer c2 = new Customer.Builder().customer_Number("customer02").name(name2).build();
         
         Name name3 = new Name();
         name3.setFirst_name("Tim");
         name3.setLast_name("Jones");
         Customer c3 = new Customer.Builder().customer_Number("customer03").name(name3).build();
         
         Name name4 = new Name();
         name4.setFirst_name("Tyrone");
         name4.setLast_name("Jones");
         Customer c4 = new Customer.Builder().customer_Number("customer04").name(name4).build();
         
         Name name5 = new Name();
         name5.setFirst_name("Jessica");
         name5.setLast_name("Johns");
         Customer c5 = new Customer.Builder().customer_Number("customer05").name(name5).build();
         
         customerRepository.save(c1);
         customerRepository.save(c2);
         customerRepository.save(c3);
         customerRepository.save(c4);
         customerRepository.save(c5);
                  
         return customerRepository.findAll();
    }
    
    @RequestMapping(value = "findById", method = RequestMethod.GET)
    @ResponseBody
    public Customer findById(Long id) {
         Name name1 = new Name();
         name1.setFirst_name("Bob");
         name1.setLast_name("Jones");
         Customer c1 = new Customer.Builder().customer_Number("customer01").name(name1).build();
         
         Name name2 = new Name();
         name2.setFirst_name("Kevin");
         name2.setLast_name("Canning");
         Customer c2 = new Customer.Builder().customer_Number("customer02").name(name2).build();
         
         Name name3 = new Name();
         name3.setFirst_name("Tim");
         name3.setLast_name("Jones");
         Customer c3 = new Customer.Builder().customer_Number("customer03").name(name3).build();
         
         Name name4 = new Name();
         name4.setFirst_name("Tyrone");
         name4.setLast_name("Jones");
         Customer c4 = new Customer.Builder().customer_Number("customer04").name(name4).build();
         
         Name name5 = new Name();
         name5.setFirst_name("Jessica");
         name5.setLast_name("Johns");
         Customer c5 = new Customer.Builder().customer_Number("customer05").name(name5).build();
         
         customerRepository.save(c1);
         customerRepository.save(c2);
         customerRepository.save(c3);
         customerRepository.save(c4);
         customerRepository.save(c5);
                  
         return customerRepository.findOne(id);
    }

    @RequestMapping(value = "create")
    @ResponseBody
    public void create(final Customer customer) {
         Name name1 = new Name();
         name1.setFirst_name("Bob");
         name1.setLast_name("Jones");
         Customer c1 = new Customer.Builder().customer_Number("customer01").name(name1).build();
         
         Name name2 = new Name();
         name2.setFirst_name("Kevin");
         name2.setLast_name("Canning");
         Customer c2 = new Customer.Builder().customer_Number("customer02").name(name2).build();
         
         Name name3 = new Name();
         name3.setFirst_name("Tim");
         name3.setLast_name("Jones");
         Customer c3 = new Customer.Builder().customer_Number("customer03").name(name3).build();
         
         Name name4 = new Name();
         name4.setFirst_name("Tyrone");
         name4.setLast_name("Jones");
         Customer c4 = new Customer.Builder().customer_Number("customer04").name(name4).build();
         
         Name name5 = new Name();
         name5.setFirst_name("Jessica");
         name5.setLast_name("Johns");
         Customer c5 = new Customer.Builder().customer_Number("customer05").name(name5).build();
         
         customerRepository.save(c1);
         customerRepository.save(c2);
         customerRepository.save(c3);
         customerRepository.save(c4);
         customerRepository.save(c5);
         customerRepository.save(c1);
    }
}
