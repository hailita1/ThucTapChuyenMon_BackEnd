package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CheckLogin {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Boolean checkLogin = true;
}
