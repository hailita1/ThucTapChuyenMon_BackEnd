package com.example.demo.repository;

import com.example.demo.model.CategoryRoom;
import com.example.demo.model.CheckLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckLoginRepository extends JpaRepository<CheckLogin, Long> {
}
