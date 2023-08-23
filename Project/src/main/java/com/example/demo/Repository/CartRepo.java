package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.CartModel;

public interface CartRepo extends JpaRepository<CartModel, Integer>{

}
