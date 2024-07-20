package com.loqoai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loqoai.model.Product;
import com.loqoai.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl productserviceimpl;

	@PostMapping("/products")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		String add = productserviceimpl.addProduct(product);
		return new ResponseEntity<>(add, HttpStatus.CREATED);

	}

	@GetMapping("/getproducts")
	public List<Product> getProducts(@RequestParam(required = false) String category,
			@RequestParam(required = false) Double maxPrice, @RequestParam(required = false) Double minPrice,
			@RequestParam(defaultValue = "price") String sortField, @RequestParam(required = false) Boolean inStock,
			@RequestParam(defaultValue = "asc") String sortOrder) {
		return productserviceimpl.getProducts(minPrice, maxPrice, category, inStock, sortField, sortOrder);
	}
}
