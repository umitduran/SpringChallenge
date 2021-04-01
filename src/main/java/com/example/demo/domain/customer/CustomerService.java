package com.example.demo.domain.customer;

import com.example.demo.dto.CustomerViewDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerViewDTO getCustomerById(Long id) {
        final Customer customer = customerRepository.findById(id).orElse(null);
        return CustomerViewDTO.of(customer);
    }
}
