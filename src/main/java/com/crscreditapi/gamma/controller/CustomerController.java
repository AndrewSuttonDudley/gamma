package com.crscreditapi.gamma.controller;

import com.crscreditapi.gamma.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<Customer> findAll() {
        return new ArrayList<>();
    }
}
