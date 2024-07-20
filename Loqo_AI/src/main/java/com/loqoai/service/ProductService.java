package com.loqoai.service;

import java.util.List;

import com.loqoai.model.Product;

public interface ProductService {

	public String addProduct(Product product);

	public List<Product> getProducts(Double minPrice, Double maxPrice, String category, Boolean inStock,
			String sortField, String sortOrder);
}
