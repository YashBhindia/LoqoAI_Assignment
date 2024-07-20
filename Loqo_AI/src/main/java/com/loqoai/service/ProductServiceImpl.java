package com.loqoai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.loqoai.model.Product;
import com.loqoai.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productrepo;

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		productrepo.save(product);
		return "Add Successfully!";
	}

	@Override
	public List<Product> getProducts(Double minPrice, Double maxPrice, String category, Boolean inStock,
			String sortField, String sortOrder) {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(Sort.Direction.fromString(sortOrder), sortField);

		if (minPrice != null && maxPrice != null) {
			return productrepo.findAllByPriceBetween(minPrice, maxPrice, sort);
		}
		if (category != null) {
			return productrepo.findAllByCategory(category, sort);
		}
		if (inStock != null) {
			return productrepo.findAllByInStock(inStock, sort);
		}
		return productrepo.findAll(sort);
	}

}
