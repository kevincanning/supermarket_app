/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Kevin Canning
 */
@Entity
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String order_number;
    private String order_date;
    
    @ManyToOne
    private Customer customer;
    
    @OneToOne
    private Invoice invoice;

    public Orders() {
    }
    
    private Orders(Builder builder) {
        id= builder.id;
        order_number = builder.order_number;
        order_date = builder.order_date;
        invoice = builder.invoice;
        customer = builder.customer;
       }
    
    public static class Builder {
        private Long id;
        private String order_number;
        private String order_date;
        private Invoice invoice;
        private Customer customer;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder order_number(String value) {
            order_number = value;
            return this;
        }
        
        public Builder order_date(String value){
            order_date = value;
            return this;
        }
        
         public Builder invoice(Invoice value){
            invoice = value;
            return this;
        }
         
        public Builder customer(Customer value){
            customer = value;
            return this;
        }
        
        public Builder Orders(Orders orders){
            id = orders.getId();
            order_number = orders.getOrder_number();
            order_date = orders.getOrder_date();
            invoice = orders.getInvoice();
            customer = orders.getCustomer();
            
            return this;
        }
        
        public Orders build() {
            return new Orders(this);
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getOrder_number() {
        return order_number;
    }

    public String getOrder_date() {
        return order_date;
    }

    public Invoice getInvoice() {
        return invoice;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.canning.supermarket_app.domain.Order[ id=" + id + " ]";
    }
    
}
