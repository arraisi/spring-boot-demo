package com.tabeldata.demo.controller;

import com.tabeldata.demo.entity.Customer;
import com.tabeldata.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> findAll() {
        final List<Customer> customers = service.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<Customer> findById(@RequestParam Integer id) {
        final Optional<Customer> customer = service.findById(id);
        return new ResponseEntity<>(customer.get(), HttpStatus.CREATED);
    }

}
