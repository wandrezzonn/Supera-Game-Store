package br.com.supera.game.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.game.store.util.ShoppingCart;
import br.com.supera.game.store.util.ShoppingCartActions;

@RestController
@RequestMapping("/products")
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCartActions actions;
	
	@GetMapping("/shoppingcart")
	public ResponseEntity<List<ShoppingCart>> shoppingCart(){
		
		return ResponseEntity.ok(actions.myCart());
	}
	
	@GetMapping("/shoppingcart/{idProduct}")
	public ResponseEntity<List<ShoppingCart>> removeProduct(@PathVariable("idProduct") Long idProduct){
		return actions.removeProduct(idProduct);
		
	}

}
