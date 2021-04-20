package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.spring_sample.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}