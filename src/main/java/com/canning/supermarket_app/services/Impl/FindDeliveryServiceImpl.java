/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.domain.Delivery;
import com.canning.supermarket_app.repository.DeliveryRepository;
import com.canning.supermarket_app.services.DeliveryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin Canning
 */
@Service
public class FindDeliveryServiceImpl implements DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public Delivery find(Long id) {
        return deliveryRepository.findOne(id);
    }

    @Override
    public Delivery persist(Delivery entity) {
        return deliveryRepository.save(entity);
    }

    @Override
    public Delivery merge(Delivery entity) {
        if (entity.getId()!=null) {
            return deliveryRepository.save(entity);
        }
        return null;
    }

    @Override
    public void remove(Delivery entity) {
        deliveryRepository.delete(entity);
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }
    
}
