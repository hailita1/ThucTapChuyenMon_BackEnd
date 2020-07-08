package com.example.demo.service.impl;

import com.example.demo.model.CheckLogin;
import com.example.demo.repository.CheckLoginRepository;
import com.example.demo.service.CheckLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckLoginServiceImpl implements CheckLoginService {
    @Autowired
    private CheckLoginRepository checkLoginRepository;
    @Override
    public Iterable<CheckLogin> findAll() {
        return checkLoginRepository.findAll();
    }

    @Override
    public void save(CheckLogin checkLogin) {
        checkLoginRepository.save(checkLogin);
    }

    @Override
    public CheckLogin findById(Long id) {
        return checkLoginRepository.findById(id).get();
    }
}
