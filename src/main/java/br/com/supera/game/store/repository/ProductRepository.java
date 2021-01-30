package br.com.supera.game.store.repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.supera.game.store.model.Product;
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>{

}
