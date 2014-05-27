/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.domain.Orders;
import com.canning.supermarket_app.repository.OrderRepository;
import com.canning.supermarket_app.services.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kevin Canning
 */
public class FindAOrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Orders find(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public Orders persist(Orders entity) {
        return orderRepository.save(entity);
    }

    @Override
    public Orders merge(Orders entity) {
           if (entity.getId()!=null) {
            return orderRepository.save(entity);
        }
        return null;
    }

    @Override
    public void remove(Orders entity) {
        orderRepository.delete(entity);
    }

    @Override
    public List<Orders> findAll() {
        return orderRepository.findAll();
    }
}