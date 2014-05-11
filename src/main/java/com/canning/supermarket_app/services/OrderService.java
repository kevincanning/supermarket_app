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
public interface OrderService <O, ID>  {
    public O findAOrder(ID id);

    public O persist(O entity);

    public O merge(O entity);

    public void remove(O entity);
    
    public List<O> getAllOders();
    
}
