package br.com.supera.game.store.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.supera.game.store.model.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

	Optional<Product> findById(Long id);
}
