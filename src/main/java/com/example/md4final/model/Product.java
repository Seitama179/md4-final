package com.example.md4final.model;

import jakarta.validation.constraints.Size;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Float price;

    private String status;

    @ManyToOne
    @JoinColumn(name = "catId")
    private Category category;

}
