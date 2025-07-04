package com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;


}
