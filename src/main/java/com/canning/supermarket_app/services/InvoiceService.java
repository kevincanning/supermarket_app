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
public interface InvoiceService<I, ID>  {
    public I find(ID id);

    public I persist(I entity);

    public I merge(I entity);

    public void remove(I entity);

    public List<I> findAll();
}
