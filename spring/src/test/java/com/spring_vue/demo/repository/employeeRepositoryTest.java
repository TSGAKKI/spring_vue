package com.spring_vue.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class employeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void findAll(){
        System.out.println(employeeRepository.findById(39670289));
    }
}