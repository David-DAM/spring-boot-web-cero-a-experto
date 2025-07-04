package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.database;

import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.ProductRepository;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.database.entity.ProductEntity;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.database.mapper.ProductEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final List<ProductEntity> products = new ArrayList<>();

    private final ProductEntityMapper productEntityMapper;


    @Override
    public void upsert(Product product) {
        ProductEntity productEntity = productEntityMapper.mapToProductEntity(product);
        products.removeIf(p -> p.getId().equals(productEntity.getId()));
        products.add(productEntity);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(productEntityMapper::mapToProduct);
    }

    @Override
    public List<Product> findAll() {
        return products.stream()
                .map(productEntityMapper::mapToProduct)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
