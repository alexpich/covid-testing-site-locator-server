package com.alex.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.springboot.cruddemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
