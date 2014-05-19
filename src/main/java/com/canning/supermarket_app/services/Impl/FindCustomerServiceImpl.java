/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.domain.Customer;
import com.canning.supermarket_app.repository.CustomerRepository;
import com.canning.supermarket_app.services.CustomerService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin Canning
 */
@Service
public class FindCustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
   
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    } 
}