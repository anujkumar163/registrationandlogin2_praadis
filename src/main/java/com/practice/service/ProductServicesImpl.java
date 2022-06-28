package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Product;
import com.practice.repository.ProductRepository;

@Service
public class ProductServicesImpl implements ProductServices {
	
	@Autowired
	private ProductRepository prorepo;

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		prorepo.save(product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> product = prorepo.findAll();
		return product;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		Optional<Product> findById = prorepo.findById(id);
		Product product = findById.get();
		return product;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		prorepo.deleteById(id);
		
	}

	@Override
	public List<Product> getBetweenProductPrice(Long price) {
		// TODO Auto-generated method stub
		return prorepo.findByPrice(price);
	}
	
	public List<Product> getBetweenProductPrice(Long priceStart, Long priceEnd) {
		// TODO Auto-generated method stub
		return prorepo.getBetweenProductPrice(priceStart, priceEnd);
	}

	

	

	
}
