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

/**
 *
 * @author Kevin Canning
 */
@Entity
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private long quantity; 
    private long price;
    private String code;
    private long amount_in_stock;
    
    @ManyToOne
    private Orders orders;
    
    private Item(Builder builder){
        id = builder.id;
        price = builder.price;
        code = builder.code;
        amount_in_stock = builder.amount_in_stock;
        orders = builder.orders;
    }
    
    public Item(){
    }
    
    public static class Builder {
        private Long id;
        private long price;
        private String code;
        private long amount_in_stock;
        private Orders orders;
          
        public Builder id(Long value){
            id = value;
            return this;
        }
        
        public Builder price(long value){
            price = value;
            return this;
        }
        
        public Builder code(String value){
            code = value;
            return this;
        }
        
        public Builder amount_in_stock(long value){
            amount_in_stock = value;
            return this;
        }
        
        public Builder orders(Orders value){
            orders = value;
            return this;
        }
        
        public Builder Item(Item item) {
            id = item.id;
            price = item.price;
            code = item.code;
            amount_in_stock = item.amount_in_stock;
            return this;
        }
        
        public Item build(){
            return new Item(this);
        }
    }
    
    public long getQuantity() {
        return quantity;
    }

    public long getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }
    
    public long getAmount_in_stock() {
        return amount_in_stock;
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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.canning.supermarket_app.domain.Item[ id=" + id + " ]";
    }
    
}
