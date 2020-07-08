package com.example.demo.service.impl;

import com.example.demo.model.CategoryRoom;
import com.example.demo.repository.CategoryRoomRepository;
import com.example.demo.service.CategoryRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryRoomServiceImpl implements CategoryRoomService {
    @Autowired
    private CategoryRoomRepository categoryRoomRepository;

    @Override
    public Iterable<CategoryRoom> findAll() {
        return categoryRoomRepository.findAll();
    }
}
