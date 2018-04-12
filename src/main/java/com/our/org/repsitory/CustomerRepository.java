package com.our.org.repsitory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.our.org.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
	
	public List<Customer> findByFirstName(Integer id);

}
