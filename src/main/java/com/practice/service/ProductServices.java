package com.practice.service;

import java.util.List;

import com.practice.entity.Product;

public interface ProductServices {
	public void saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Product getProductById(long id);
	
	public void deleteById(long id);

	//public List<Product> getBetweenProductPrice(Long price);

	public List<Product> getBetweenProductPrice(Long price);

	public List<Product> getBetweenProductPrice(Long priceStart, Long priceEnd);

	

}
