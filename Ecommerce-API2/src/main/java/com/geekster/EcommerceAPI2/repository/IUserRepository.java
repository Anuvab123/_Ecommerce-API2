package com.geekster.EcommerceAPI2.repository;

import com.geekster.EcommerceAPI2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Integer> {

    public User findUserByUserId(Integer UserId);
}
