package com.springframework.udemyprac.services;

import com.springframework.udemyprac.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void deleteById(UUID customerId);
}
