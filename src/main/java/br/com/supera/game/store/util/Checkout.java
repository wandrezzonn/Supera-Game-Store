package br.com.supera.game.store.util;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class Checkout {
	
	private int quantityOfProducts;
	private BigDecimal totalFreight = new BigDecimal("0.0");
	private BigDecimal total = new BigDecimal("0.0");
	private List<ShoppingCart> shoppingCartList;
	

	public Checkout(List<ShoppingCart> shoppingCartList) {
		this.shoppingCartList = shoppingCartList;
	}

	public BigDecimal getTotal() {
		for(int i = 0; i<shoppingCartList.size(); i++) {
       this.total = this.total.add(shoppingCartList.get(i)
    		   .getProducts()
    		   .getPrice())
    		   .add(shoppingCartList.get(i)
    		   .getFreight());
		}
		return total;
	}

	public int getQuantityOfProducts() {
		int size = shoppingCartList.size();
		return this.quantityOfProducts = size;
	}

	public BigDecimal getTotalFreight() {
		for(int i = 0; i<shoppingCartList.size(); i++) {
			this.totalFreight = this.totalFreight
					.add(shoppingCartList.get(i)
					.getFreight());
		}
		return totalFreight;
	}

	public List<ShoppingCart> getShoppingCartList() {
		for (int i = 0; i < shoppingCartList.size(); i++) {
			shoppingCartList.get(i).getProducts();
		}
		return shoppingCartList;
	}

}
