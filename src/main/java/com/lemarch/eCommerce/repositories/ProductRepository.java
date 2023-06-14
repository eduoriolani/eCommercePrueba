package com.lemarch.eCommerce.repositories;

import com.lemarch.eCommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
