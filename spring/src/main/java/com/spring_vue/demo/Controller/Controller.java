package com.spring_vue.demo.Controller;

import com.spring_vue.demo.entity.Employee;
import com.spring_vue.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class Controller {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Employee> findById(@PathVariable Integer page, @PathVariable Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return employeeRepository.findAll(pageable);
    }
}
