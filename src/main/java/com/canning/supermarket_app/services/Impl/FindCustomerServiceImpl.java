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
    public Customer find(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer persist(Customer entity) {
        return customerRepository.save(entity);
    }

    @Override
    public Customer merge(Customer entity) {
           if (entity.getId()!=null) {
            return customerRepository.save(entity);
        }
        return null;
    }

    @Override
    public void remove(Customer entity) {
        customerRepository.delete(entity);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
