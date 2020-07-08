package com.example.demo.service.impl;

import com.example.demo.model.Customer;
import com.example.demo.model.Deal;
import com.example.demo.model.House;
import com.example.demo.repository.DealRepository;
import com.example.demo.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealServiceImpl implements DealService {
    @Autowired
    private DealRepository dealRepository;

    @Override
    public Iterable<Deal> findAll() {
        return dealRepository.findAll();
    }

    @Override
    public Deal findById(Long id) {
        return dealRepository.findById(id).get();
    }

    @Override
    public void save(Deal deal) {
        dealRepository.save(deal);
    }

    @Override
    public void remove(Long id) {
        dealRepository.deleteById(id);
    }

    @Override
    public Iterable<Deal> findAllByCustomerAndTrangThai(Customer customer, String trangThai) {
        return dealRepository.findAllByCustomerAndTrangThai(customer, trangThai);
    }


    @Override
    public Iterable<Deal> findAllByHouse(House house) {
        return dealRepository.findAllByHouse(house);
    }
}
