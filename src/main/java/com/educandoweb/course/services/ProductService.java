package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	

	public Product findAllById(Long id){
		 Optional<Product> obj = productRepository.findById(id);
		 return obj.get();
		
	}

}
