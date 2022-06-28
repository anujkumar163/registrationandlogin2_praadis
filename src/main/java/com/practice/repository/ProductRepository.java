package com.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	///void callquery(@Query(value= "select * from product where price in (100,200)"));
	//@Query(value = "select * from product where price in (100, 500) ");
	@Query(value = "SELECT * FROM product where price>:price", nativeQuery = true)
	List<Product> findByPrice(long price);

	@Query(value = "SELECT * FROM product where price>:priceStart and price<:priceEnd", nativeQuery = true)
	List<Product> getBetweenProductPrice(Long priceStart, Long priceEnd);

	
	
	
}	