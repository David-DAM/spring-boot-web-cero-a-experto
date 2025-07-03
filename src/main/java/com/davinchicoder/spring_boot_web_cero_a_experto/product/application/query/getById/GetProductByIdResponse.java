package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getById;

import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetProductByIdResponse {

    private Product product;
}

