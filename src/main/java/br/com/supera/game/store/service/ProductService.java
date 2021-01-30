package br.com.supera.game.store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.supera.game.store.model.Product;
import br.com.supera.game.store.repository.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository =  productRepository;
	}
	
	
	public List<Product> findAll(){
		
		return productRepository.findAll();
	}
	
}
