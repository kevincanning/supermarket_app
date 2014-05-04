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
public interface DeliveryService<D, ID>  {
    public D find(ID id);

    public D persist(D entity);

    public D merge(D entity);

    public void remove(D entity);

    public List<D> findAll();
}
