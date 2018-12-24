package com.ayv.cargoods.repo;


import com.ayv.cargoods.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Long> {

}
