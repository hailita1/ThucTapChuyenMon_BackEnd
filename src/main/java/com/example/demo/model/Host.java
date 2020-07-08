package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Host {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idChuNha;

    @Column(unique = true)
    private String userName;

    private String password;

    private String hoTen;

    private String diaChi;

    private String sdt;

}
