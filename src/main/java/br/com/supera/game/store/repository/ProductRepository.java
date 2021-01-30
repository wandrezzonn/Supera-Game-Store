package br.com.supera.game.store.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.supera.game.store.model.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{

}
