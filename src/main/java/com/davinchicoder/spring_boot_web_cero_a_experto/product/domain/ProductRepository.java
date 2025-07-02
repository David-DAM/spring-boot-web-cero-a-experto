package com.davinchicoder.spring_boot_web_cero_a_experto.product.domain;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    void upsert(Product product);

    Optional<Product> findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);
}
