/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.domain.CreditCard;
import com.canning.supermarket_app.domain.CreditCard_;
import com.canning.supermarket_app.domain.Invoice;
import com.canning.supermarket_app.repository.InvoiceRepository;
import com.canning.supermarket_app.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin Canning
 */
@Service
public class FindInvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    
    @Override
    public Object findAInvoice(Object id) {
        return invoiceRepository.findOne(Long.MIN_VALUE);
    }
}