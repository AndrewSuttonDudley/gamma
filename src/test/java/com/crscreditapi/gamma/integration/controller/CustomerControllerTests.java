package com.crscreditapi.gamma.integration.controller;

import com.crscreditapi.gamma.controller.CustomerController;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

@ActiveProfiles("test")
@SpringBootTest
@Testcontainers
public class CustomerControllerTests {

    @Autowired
    private CustomerController customerController;

    @Test
    public void testFindAll() {
        assertTrue(customerController.findAll().size() > 0);
    }
}
