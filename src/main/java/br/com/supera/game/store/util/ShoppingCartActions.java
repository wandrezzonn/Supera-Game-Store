package br.com.supera.game.store.util;

import java.math.BigDecimal;
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

	private BigDecimal freight = new BigDecimal("10.00");
	private List<ShoppingCart> shoppingCartList = new ArrayList<ShoppingCart>();
	
	@Autowired private ProductService productService;

	public ShoppingCartActions() {}
	
	public ResponseEntity<List<ShoppingCart>> addToShoppingCart(Long idProduct) {
		Optional<Product> product = productService.findById(idProduct);
		if (product.isPresent()) {
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart.setProducts(product.get());
			shoppingCart.setSubtotal(product.get().getPrice());
			if (product.get().getPrice().compareTo(product.get().getPrice()) < 250.00) {
				shoppingCart.setFreight(freight);
				shoppingCart.setTotal(product.get().getPrice().add(freight));

			} else {
				shoppingCart.setFreight(new BigDecimal(0.0));
			}

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
