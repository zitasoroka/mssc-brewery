package net.breweryofficial.msscbrewery.services;

import net.breweryofficial.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteById(UUID id);

}
