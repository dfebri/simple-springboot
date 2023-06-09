package com.enigma.fruitmart.service;

import com.enigma.fruitmart.entitas.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer (Customer customer);
    Customer updateCustomer (Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerById(String id);
    void deleteCustomer (String id);
    List<Customer> searchCustomer (String customerName);




}
