package br.com.supera.game.store.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supera.game.store.model.Product;
import br.com.supera.game.store.service.ProductService;

@Service
public class ShoppingCartActions {

	private BigDecimal freight = new BigDecimal("10.00");
	@Autowired
	ProductService productService;

	public ShoppingCartActions() {

	}

	public List<ShoppingCart> add(Long idProduct) {
		Optional<Product> product = productService.findById(idProduct);
		List<ShoppingCart> shoppingCartList = new ArrayList<ShoppingCart>();

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
		}

		return shoppingCartList;

	}

}
