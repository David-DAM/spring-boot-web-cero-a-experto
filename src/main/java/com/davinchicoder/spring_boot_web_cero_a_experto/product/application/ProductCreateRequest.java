package com.davinchicoder.spring_boot_web_cero_a_experto.product.application;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.Request;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ProductCreateRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;
}
