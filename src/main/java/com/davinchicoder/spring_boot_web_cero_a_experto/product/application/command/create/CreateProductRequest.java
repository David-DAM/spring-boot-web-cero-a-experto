package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.command.create;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.Request;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class CreateProductRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private MultipartFile file;
}
