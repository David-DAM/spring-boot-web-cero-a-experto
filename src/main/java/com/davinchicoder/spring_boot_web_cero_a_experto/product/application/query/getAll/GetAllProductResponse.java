package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getAll;

import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class GetAllProductResponse {

    private List<Product> products;
}

