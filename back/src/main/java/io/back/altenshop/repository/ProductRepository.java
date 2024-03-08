package io.back.altenshop.repository;

import io.back.altenshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long> { //JPAREPOSITORY
}
