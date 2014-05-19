/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.supermarket_app.services.Impl;

import com.canning.supermarket_app.repository.ItemRepository;
import com.canning.supermarket_app.services.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin Canning
 */
@Service
public class FindItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List getAllItems() {
        return itemRepository.findAll();
    }

}
