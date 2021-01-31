package br.com.supera.game.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.game.store.model.Product;
import br.com.supera.game.store.service.ProductService;
import br.com.supera.game.store.util.ShoppingCart;
import br.com.supera.game.store.util.ShoppingCartActions;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ShoppingCartActions actions;
	@GetMapping
	public ResponseEntity<Page<Product>> findAll(Pageable pageable){
		return ResponseEntity.ok(productService.findAll(pageable));
	}
	
	@GetMapping("/add/{idProduct}")
	public ResponseEntity<List<ShoppingCart>> shoppingCart(@PathVariable("idProduct") Long idProduct){
		return actions.add(idProduct);
	}
}
