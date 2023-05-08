package com.geekster.EcommerceAPI2.controllers;

import com.geekster.EcommerceAPI2.models.Address;
import com.geekster.EcommerceAPI2.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    IAddressRepository addressRepository;
    @PostMapping(value="/address")
    public void createAddress(@RequestBody Address address){
        addressRepository.save(address);
    }
}
