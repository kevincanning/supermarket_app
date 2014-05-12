/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
/**
 *
 * @author Kevin Canning
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String customer_number;
    
    @Embedded
    private Name name;
    
    @Embedded
    private ContactDetails contactDetails;
    
    @Embedded
    private CustomerAddress customerAddress;
    
    @OneToMany(orphanRemoval=true, cascade= CascadeType.ALL)
    @JoinColumn(name = "customer_number") 
    private List<CreditCard> creditCard;
    
    @OneToMany(orphanRemoval=true,cascade= CascadeType.ALL)
    @JoinColumn(name = "order_number")
    private List<Orders> order;
    
        private Customer(Builder builder) {
        id = builder.id;
        customer_number = builder.customer_Number;
        name = builder.name;
        contactDetails = builder.contactDetails;
        customerAddress = builder.customerAddress;
        creditCard = builder.creditCard;
        order = builder.orders;
       }
    
        public Customer(){
        }
        
        public static class Builder {
        private Long id;
        private String customer_Number;
        private Name name;
        private ContactDetails contactDetails;
        private CustomerAddress customerAddress;
        List<CreditCard> creditCard;
        List<Orders> orders;
        
        public Builder id(Long value) {
            id = value;
            return this;
        }

        public Builder customer_Number(String value) {
            customer_Number = value;
            return this;
        }
        
         public Builder name(String firstname, String lastname) {
            firstname = name.getFirst_name();
            lastname = name.getLast_name();
            return this;
        }
         
        public Builder contactDetails(String cell_number, String home_number, String email_address) {
            cell_number = contactDetails.getCell_number();
            home_number = contactDetails.getHome_number();
            email_address = contactDetails.getEmail_address();
            return this;
        }
          public Builder customerAddress(String street_address, String postal_address){
            street_address = customerAddress.getStreet_address();
            postal_address = customerAddress.getPostal_address();
            return this;           
        }
        
          public Builder creditCard(List<CreditCard> value){         
              creditCard = value;
              
              return this;
          }
          
          public Builder order(List<Orders> value){
              orders = value;
              return this;
          }
          
          public Builder customer(Customer customer){
              id = customer.getId();
              customer_Number = customer.getCustomer_number();
              name = customer.getName();
              contactDetails = customer.getContactDetails();
              customerAddress = customer.getCustomerAddress();
              creditCard = customer.getCreditCard();
              orders = customer.getOrder();
              return this;              
          }
          
        public Customer build(){
            return new Customer(this);
        }
        }
        
    public String getCustomer_number() {
        return customer_number;
    }

    public Name getName() {
        return name;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    
    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public List<CreditCard> getCreditCard() {
        return creditCard;
    }

    public List<Orders> getOrder() {
        return order;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.canning.supermarket_app.domain.Customer[ id=" + id + " ]";
    }
    
}
