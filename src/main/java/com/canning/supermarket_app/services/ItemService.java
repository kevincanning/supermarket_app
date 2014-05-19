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
public interface ItemService<I, ID>  {
 
    public List<I> getAllItems();
}
