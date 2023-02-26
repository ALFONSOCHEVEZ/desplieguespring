package com.example.pruebadespelgar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.pruebadespelgar.models.ProductDTO;


@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String>{

}
