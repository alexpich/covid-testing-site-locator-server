package com.alex.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
