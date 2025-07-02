package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.database;

import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final List<Product> products;

    public ProductRepositoryImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public void upsert(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void deleteById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
