package com.geekster.EcommerceAPI2.repository;

import com.geekster.EcommerceAPI2.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepository extends CrudRepository<Address,Integer> {
}
