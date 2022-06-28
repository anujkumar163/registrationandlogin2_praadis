package com.practice.controller;

import java.beans.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Product;
import com.practice.service.ProductServices;

@RestController
@RequestMapping("/papi")
public class ProductController {
	
	private Statement stmt;
	@Autowired
	private ProductServices prservice;

	@PostMapping("/save")
	public void saveProduct(@RequestBody Product product) {
		prservice.saveProduct(product);
	}

	@GetMapping("/getproduct")
	public List<Product> getAllProduct() {
		List<Product> product = prservice.getAllProduct();
		return product;

	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") long id) {
		prservice.deleteById(id);
	}

	public void updateProduct(@RequestBody Product product) {
		prservice.saveProduct(product);
	}
	
	@GetMapping("price/{priceStart}/{priceEnd}")
	public List<Product> getBetweenProductPrice(@PathVariable(value="priceStart") Long priceStart,@PathVariable(value="priceEnd") Long priceEnd){
		System.out.println(priceStart);
		System.out.println(priceEnd);
		return prservice.getBetweenProductPrice(priceStart, priceEnd);
	}
	
	
	
}
