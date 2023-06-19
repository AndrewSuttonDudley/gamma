package com.crscreditapi.gamma.controller;

import com.crscreditapi.gamma.dto.CustomerDto;
import com.crscreditapi.gamma.mapper.CustomerMapper;
import com.crscreditapi.gamma.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerMapper customerMapper;

    private final CustomerService customerService;

    public CustomerController(CustomerMapper customerMapper,
                              CustomerService customerService) {
        this.customerMapper = customerMapper;
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> findAll() {
        return customerMapper.list(customerService.findAll());
    }
}
