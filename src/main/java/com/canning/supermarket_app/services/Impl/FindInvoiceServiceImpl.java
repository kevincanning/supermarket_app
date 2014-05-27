/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.domain.Invoice;
import com.canning.supermarket_app.repository.InvoiceRepository;
import com.canning.supermarket_app.services.InvoiceService;
import java.util.List;
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
    public Invoice find(Long id) {
        return invoiceRepository.findOne(id);
    }

    @Override
    public Invoice persist(Invoice entity) {
        return invoiceRepository.save(entity);
    }

    @Override
    public Invoice merge(Invoice entity) {
           if (entity.getId()!=null) {
            return invoiceRepository.save(entity);
        }
        return null;
    }

    @Override
    public void remove(Invoice entity) {
        invoiceRepository.delete(entity);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }
}