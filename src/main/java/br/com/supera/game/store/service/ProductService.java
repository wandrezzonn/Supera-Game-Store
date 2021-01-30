package br.com.supera.game.store.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.supera.game.store.model.Product;
import br.com.supera.game.store.repository.ProductRepository;

@Service
public class ProductService{
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository =  productRepository;
	}
	
	
	public Page<Product> findAll(Pageable pageable){
		
		return  productRepository.findAll(pageable);
	}
	
	public Optional<Product> findById(Long id){
		return productRepository.findById(id);
	}
	
}
