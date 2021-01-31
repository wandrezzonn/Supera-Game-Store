package br.com.supera.game.store.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.supera.game.store.model.Product;
import br.com.supera.game.store.service.ProductService;

@Service
public class ShoppingCartActions {
	private List<ShoppingCart> shoppingCartList = new ArrayList<ShoppingCart>();
	
	@Autowired private ProductService productService;

	public ShoppingCartActions() {}
	
	public ResponseEntity<List<ShoppingCart>> addToShoppingCart(Long idProduct) {
		Optional<Product> product = productService.findById(idProduct);
		if (product.isPresent()) {
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart.setSubtotal(product.get().getPrice());
			shoppingCart.setFreight(Freight.freight(product.get()));
			shoppingCart.setTotal(product.get().getPrice().add(Freight.freight(product.get())));
			shoppingCart.setProducts(product.get());
			shoppingCartList.add(shoppingCart);
			return ResponseEntity.ok(shoppingCartList);
		}

		return ResponseEntity.notFound().build();

	}
	
	
	public ResponseEntity<List<ShoppingCart>> removeProduct(Long id){
	      for(int i = 0; i <shoppingCartList.size(); i++) {
	    	  if(shoppingCartList.get(i).getProducts().getId() == id) {
	    		  shoppingCartList.remove(i);
	    		  return ResponseEntity.ok(shoppingCartList);
	    	  }
	      }
	      return ResponseEntity.notFound().build();
	}
	
	public List<ShoppingCart> myShoppingCart(){
		return shoppingCartList;
	}

}
