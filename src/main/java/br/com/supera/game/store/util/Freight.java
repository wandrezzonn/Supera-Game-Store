package br.com.supera.game.store.util;
import java.math.BigDecimal;
import br.com.supera.game.store.model.Product;

public class Freight {
	private static BigDecimal freight;
	public static BigDecimal freight(Product product) {
		if(!(product.getPrice().compareTo(new BigDecimal("250.00"))==1)) {
			freight = new BigDecimal("10.0");
		}else {
			freight = new BigDecimal("0.0");
		}
		return freight;
		
	}
}
