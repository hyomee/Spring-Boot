package co.kr.abacus.spring.async.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final List<Product> products = new ArrayList<Product>();
	
	@Override
	public Iterable<Product> findAll() {
		return List.copyOf(this.products);
	}
	
	@PostConstruct
	public void init() {
		createProducts();
	}

	

	private List<Product> createProducts() {
		for ( int i = 0; i <30; i++) {
			this.products.add(createProduct(i));
		}
		return products;
	}



	private Product createProduct(int i) {
		return new Product("Products :: " + i );
	}

		
}
