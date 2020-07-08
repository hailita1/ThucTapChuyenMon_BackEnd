package com.example.demo.repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Deal;
import com.example.demo.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal, Long> {
    Iterable<Deal> findAllByCustomerAndTrangThai(Customer customer, String trangThai);

    Iterable<Deal> findAllByHouse(House house);
}
