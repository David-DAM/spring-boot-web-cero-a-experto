package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.command.update;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.Request;
import lombok.Data;

@Data
public class UpdateProductRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;
}
