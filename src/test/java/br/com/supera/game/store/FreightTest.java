package br.com.supera.game.store;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import br.com.supera.game.store.model.Product;

@SpringBootTest
public class FreightTest {
	 Product product = new Product();
	@Test
	public void freight() {
		product.setPrice(new BigDecimal("241"));
		if(!(product.getPrice().compareTo(new BigDecimal("250.00"))==1)) {
			assertFalse(false);
		}
		
		
	}
}
