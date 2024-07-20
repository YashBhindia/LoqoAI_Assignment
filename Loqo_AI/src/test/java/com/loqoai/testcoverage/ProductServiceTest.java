package com.loqoai.testcoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import com.loqoai.model.Product;
import com.loqoai.repository.ProductRepository;
import com.loqoai.service.ProductServiceImpl;
@SpringBootTest
public class ProductServiceTest {

	 @Mock
	    private ProductRepository productrepository;

	    @InjectMocks
	    private ProductServiceImpl productServiceimpl;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    void testAddProduct() {
	        Product product = new Product();
	        product.set_id(1);
	        product.setName("Smartphone");

	        when(productrepository.save(product)).thenReturn(product);

	        String result = productServiceimpl.addProduct(product);

	        assertEquals("Add Successfully!", result);
	       
	    }

	    @Test
	    void testGetProductsByPriceRange() {
	        Product product1 = new Product();
	        product1.setPrice(150.0);

	        Product product2 = new Product();
	        product2.setPrice(200.0);

	        List<Product> products = Arrays.asList(product1, product2);

	        when(productrepository.findAllByPriceBetween(100.0, 200.0, Sort.by(Sort.Direction.ASC, "price")))
	                .thenReturn(products);

	        List<Product> result = productServiceimpl.getProducts(100.0, 200.0, null, null, "price", "asc");

	        assertEquals(2, result.size());
	       
	    }

	    @Test
	    void testGetProductsByCategory() {
	        Product product1 = new Product();
	        product1.setCategory("electronics");

	        List<Product> products = Arrays.asList(product1);

	        when(productrepository.findAllByCategory("electronics", Sort.by(Sort.Direction.ASC, "price")))
	                .thenReturn(products);

	        List<Product> result = productServiceimpl.getProducts(null, null, "electronics", null, "price", "asc");

	        assertEquals(1, result.size());
	       
	    }

	    @Test
	    void testGetProductsByInStock() {
	        Product product1 = new Product();
	        product1.setInStock(true);

	        List<Product> products = Arrays.asList(product1);

	        when(productrepository.findAllByInStock(true, Sort.by(Sort.Direction.ASC, "price"))).thenReturn(products);

	        List<Product> result = productServiceimpl.getProducts(null, null, null, true, "price", "asc");

	        assertEquals(1, result.size());
	        
	    }

	    @Test
	    void testGetProductsNoFilter() {
	        Product product1 = new Product();
	        product1.setPrice(150.0);

	        Product product2 = new Product();
	        product2.setPrice(200.0);

	        List<Product> products = Arrays.asList(product1, product2);

	        when(productrepository.findAll(Sort.by(Sort.Direction.ASC, "price"))).thenReturn(products);

	        List<Product> result = productServiceimpl.getProducts(null, null, null, null, "price", "asc");

	        assertEquals(2, result.size());
	        

	}

}
