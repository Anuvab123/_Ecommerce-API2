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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Address> addressList;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Order> orderList;
}
