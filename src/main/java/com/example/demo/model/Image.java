package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnh;
    private String tenAnh;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_nha")
    private House house;
}
