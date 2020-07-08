package com.example.demo.service;

import com.example.demo.model.CheckLogin;
import com.example.demo.model.Customer;

public interface CheckLoginService {
    Iterable<CheckLogin> findAll();
    void save(CheckLogin checkLogin);
    CheckLogin findById(Long id);
}
