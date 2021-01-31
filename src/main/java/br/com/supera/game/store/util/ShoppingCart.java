package br.com.supera.game.store.util;

import java.math.BigDecimal;

import br.com.supera.game.store.model.Product;
public class ShoppingCart {
	private Product products;
	private BigDecimal freight;
	private BigDecimal subtotal;
	private BigDecimal total;
	
	public ShoppingCart() {

	}

	public ShoppingCart(Product products, BigDecimal subtotal, BigDecimal total, BigDecimal freight) {
		super();
		this.products = products;
		this.subtotal = subtotal;
		this.total = total;
		this.freight = freight;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

}
