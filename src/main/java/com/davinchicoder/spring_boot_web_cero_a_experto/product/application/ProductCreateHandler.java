package com.davinchicoder.spring_boot_web_cero_a_experto.product.application;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.RequestHandler;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCreateHandler implements RequestHandler<ProductCreateRequest, Void> {

    private final ProductRepository productRepository;

    @Override
    public Void handle(ProductCreateRequest request) {

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
    public Class<ProductCreateRequest> getRequestType() {
        return ProductCreateRequest.class;
    }
}
