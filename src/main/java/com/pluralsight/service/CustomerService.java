package com.pluralsight.service;

import java.util.List;

import com.pluralsight.spring_sample.Customer;

public interface CustomerService {

	List<Customer> findAll();

}