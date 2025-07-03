package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;

}
