package com.enigma.fruitmart.repository;

import com.enigma.fruitmart.entitas.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    List<Customer> findCustomerByCustomerNameContainingIgnoreCase (String nameCriteria);

}


