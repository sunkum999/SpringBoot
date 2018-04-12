package com.our.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.our.org.domain.Customer;
import com.our.org.repsitory.CustomerRepository;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Request come true..");
		Customer customer = new Customer(101, "Suraj", "Kumar");
		Customer.Shop shop = new Customer.Shop();
		shop.setId(102);
		shop.setReginstrationNo("15CD1");
		shop.setShopName("NIM");
		customer.setShop(shop);
		Customer customer2 = repository.save(customer);
		
		System.out.println(customer2.toString());
	}
}