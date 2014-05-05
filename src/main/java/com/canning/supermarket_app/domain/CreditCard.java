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
import javax.persistence.ManyToOne;

/**
 *
 * @author Kevin Canning
 */
@Entity
public class CreditCard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String card_number;
    private String expiry_date;
    
    private String name_on_card;
    
    @ManyToOne
    private Customer customer;

    public CreditCard() {
    }
    
    private CreditCard(Builder builder) {
        id= builder.id;
        card_number = builder.card_number;
        expiry_date = builder.expiry_date;
        name_on_card = builder.name_on_card;
       }
    
    public static class Builder {
        private Long id;
        private String card_number;
        private String expiry_date;
        private String name_on_card;
        private Customer customer;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder card_number(String value) {
            card_number = value;
            return this;
        }
        
        public Builder expiry_date(String value){
            expiry_date = value;
            return this;
        }
        
        public Builder name_on_card(String value){
            name_on_card = value;
            return this;
        }
        
        public Builder customer(Customer value){
            customer = value;
            return this;
        }
        
        public Builder CreditCard(CreditCard creditCard){
            id = creditCard.getId();
            card_number = creditCard.getCard_number();
            expiry_date = creditCard.getExpiry_date();
            name_on_card = creditCard.getName_on_card();
            customer = creditCard.getCustomer();
            
            return this;
        }
        
            public CreditCard build(){
            return new CreditCard(this);
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getName_on_card() {
        return name_on_card;
    }

    public void setName_on_card(String name_on_card) {
        this.name_on_card = name_on_card;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof CreditCard)) {
            return false;
        }
        CreditCard other = (CreditCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.canning.supermarket_app.domain.CreditCard[ id=" + id + " ]";
    }
    
}
