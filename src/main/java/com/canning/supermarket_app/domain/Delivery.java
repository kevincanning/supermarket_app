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
import javax.persistence.OneToOne;

/**
 *
 * @author Kevin Canning
 */
@Entity
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String delivery_needed; //No or Yes option
    private String street_address;
    private String contact_number;
    
    @OneToOne
    private Orders orders;

    public Delivery() {
    }
    
    private Delivery(Builder builder) {
        id= builder.id;
        delivery_needed = builder.delivery_needed;
        street_address = builder.street_address;
        contact_number = builder.contact_number;
       }
    
    public static class Builder {
        private Long id;
        private String delivery_needed;
        private String street_address;
        private String contact_number;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder delivery_needed(String value) {
            delivery_needed = value;
            return this;
        }
        
        public Builder street_address(String value){
            street_address = value;
            return this;
        }
        
        public Builder contact_number(String value){
            contact_number = value;
            return this;
        }
        
        public Builder Delivery(Delivery delivery){
            id = delivery.getId();
            delivery_needed = delivery.getDelivery_needed();
            street_address = delivery.getStreet_address();
            contact_number = delivery.getContact_number();
            
            return this;
        }
        
            public Delivery build(){
            return new Delivery(this);
        }
    }

    public String getDelivery_needed() {
        return delivery_needed;
    }

    public String getStreet_address() {
        return street_address;
    }

    public String getContact_number() {
        return contact_number;
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
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.canning.supermarket_app.domain.Delivery[ id=" + id + " ]";
    }
    
}
