package com.geekster.EcommerceAPI2.repository;

import com.geekster.EcommerceAPI2.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface IOrderRepository extends CrudRepository<Order,Integer> {

    public Order findOrderByOrderId(Integer orderId);
}
