/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services;

/**
 *
 * @author Kevin Canning
 */
public interface InvoiceService<I, ID>  {
     
    public I findAInvoice(ID id);
}
