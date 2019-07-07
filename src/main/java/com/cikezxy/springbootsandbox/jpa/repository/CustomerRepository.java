package com.cikezxy.springbootsandbox.jpa.repository;

import com.cikezxy.springbootsandbox.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByFirstName(String firstName);
}
