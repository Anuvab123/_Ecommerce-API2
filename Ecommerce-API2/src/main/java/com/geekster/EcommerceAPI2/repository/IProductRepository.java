package com.geekster.EcommerceAPI2.repository;

import com.geekster.EcommerceAPI2.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductRepository extends CrudRepository<Product,Integer> {
    @Query(value = "select * from product where category = :cat" , nativeQuery = true)
    public List<Product> findProductsByCategory(String cat);
}
