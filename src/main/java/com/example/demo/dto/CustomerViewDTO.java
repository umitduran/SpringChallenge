package com.example.demo.dto;

import com.example.demo.domain.customer.Customer;
import lombok.Data;

@Data
public class CustomerViewDTO {
    private String firstName;
    private String lastName;

    public CustomerViewDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static CustomerViewDTO of(Customer customer) {
        return new CustomerViewDTO(customer.getFirstName(),customer.getLastName());
    }
}
