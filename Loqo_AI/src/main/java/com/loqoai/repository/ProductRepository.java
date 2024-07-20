package com.loqoai.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loqoai.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findAllByPriceBetween(Double minPrice, Double maxPrice, Sort sort);
	List<Product> findAllByCategory(String category, Sort sort);
    List<Product> findAllByInStock(Boolean inStock, Sort sort);

}
