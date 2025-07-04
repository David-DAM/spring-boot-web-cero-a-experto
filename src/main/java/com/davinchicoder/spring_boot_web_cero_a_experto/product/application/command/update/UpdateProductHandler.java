package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.command.update;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.RequestHandler;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.entity.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateProductHandler implements RequestHandler<UpdateProductRequest, Void> {

    private final ProductRepository productRepository;

    @Override
    public Void handle(UpdateProductRequest request) {

        Product product = Product.builder()
                .id(request.getId())
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .image(request.getImage())
                .build();

        productRepository.upsert(product);

        return null;
    }

    @Override
    public Class<UpdateProductRequest> getRequestType() {
        return UpdateProductRequest.class;
    }
}
