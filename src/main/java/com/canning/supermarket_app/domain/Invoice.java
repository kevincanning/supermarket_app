/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Kevin Canning
 */
@Entity
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoice_date;
    
    private long total;
    
    @OneToOne
    private Orders orders;
    
    private Invoice(Builder builder) {
        id= builder.id;
        invoice_date = builder.invoice_date;
        total = builder.total;
       }
    
    public static class Builder {
        private Long id;
        private Date invoice_date;
        private long total;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder invoice_date(Date value) {
            invoice_date = value;
            return this;
        }
        
        public Builder total(long value){
            total = value;
            return this;
        }
                
        public Builder Invoice(Invoice invoice){
            id = invoice.getId();
            invoice_date = invoice.getInvoice_date();
            total = invoice.getTotal();
                        
            return this;
        }
        
            public Invoice build(){
            return new Invoice(this);
        }
    }

    public Date getInvoice_date() {
        return invoice_date;
    }

    public long getTotal() {
        return total;
    }

    public Orders getOrders() {
        return orders;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.canning.supermarket_app.domain.Invoice[ id=" + id + " ]";
    }
    
}
