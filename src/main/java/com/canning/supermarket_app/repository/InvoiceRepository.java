/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.repository;

import com.canning.supermarket_app.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin Canning
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{
    
}
