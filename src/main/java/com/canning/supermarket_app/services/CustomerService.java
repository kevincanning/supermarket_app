/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services;

import com.canning.supermarket_app.domain.Customer;
import java.util.List;

/**
 *
 * @author Kevin Canning
 */
public interface CustomerService {

    public List<Customer> getAllCustomers();
}
