package com.example.demo.api;

import com.example.demo.domain.customer.CustomerService;
import com.example.demo.dto.CustomerViewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("customer/{id}")
    public ResponseEntity<CustomerViewDTO> getCustomerById(@PathVariable("id") Long id) {
        final CustomerViewDTO customerViewDTO = customerService.getCustomerById(id);
        return ResponseEntity.ok(customerViewDTO);
    }
}
