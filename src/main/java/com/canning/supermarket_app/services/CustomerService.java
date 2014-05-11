/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services;

import java.util.List;

/**
 *
 * @author Kevin Canning
 */
public interface CustomerService<C, ID>  {
    
    public C findCustomer(ID id);

    public C persist(C entity);

    public C merge(C entity);

    public void remove(C entity);
    public List<C> getAllCustomers();
}
