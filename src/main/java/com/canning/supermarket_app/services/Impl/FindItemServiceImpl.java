/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.domain.Item;
import com.canning.supermarket_app.repository.ItemRepository;
import com.canning.supermarket_app.services.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin Canning
 */
@Service
public class FindItemServiceImpl implements Services<Item, Long> {
    @Autowired
    private ItemRepository itemRepository;
            
    @Override
    public Item find(Long id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item persist(Item entity) {
        return itemRepository.save(entity);
    }

    @Override
    public Item merge(Item entity) {
           if (entity.getId()!=null) {
            return itemRepository.save(entity);
        }
        return null;
    }

    @Override
    public void remove(Item entity) {
        itemRepository.delete(entity);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}
