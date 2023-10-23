package com.Rest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Rest.Model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
