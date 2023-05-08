package com.geekster.EcommerceAPI2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Integer price;
    private String productDescription;
    private String category;
    private String brand;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
    private List<Order> order;
}
