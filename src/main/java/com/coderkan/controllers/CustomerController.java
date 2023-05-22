package com.coderkan.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderkan.models.Customer;


@RestController
public class CustomerController {

	@GetMapping(value = "/customers")
	public ResponseEntity<Object> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		return ResponseEntity.ok(customers);
	}

	@GetMapping(value = "/customers/{id}")
	public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id) {
		Customer customer = new Customer();
		return ResponseEntity.ok(customer);
	}

	@PostMapping(value = "/customers")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {
		Customer created = new Customer();
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}

	@PutMapping(value = "/customers")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer) {
		Customer updated = new Customer();
		return ResponseEntity.ok(updated);
	}

	@DeleteMapping(value = "/customers/{id}")
	public ResponseEntity<Object> deleteCustomerById(@PathVariable("id") String id) {
		return ResponseEntity.ok().build();
	}
}
