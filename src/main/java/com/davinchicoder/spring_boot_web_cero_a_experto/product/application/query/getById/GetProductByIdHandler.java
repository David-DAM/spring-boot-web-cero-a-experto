package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getById;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.RequestHandler;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductByIdHandler implements RequestHandler<GetProductByIdRequest, GetProductByIdResponse> {

    private final ProductRepository productRepository;

    @Override
    public GetProductByIdResponse handle(GetProductByIdRequest request) {


        Product product = productRepository.findById(request.getId()).orElseThrow(() -> new IllegalArgumentException("Product not found"));

        return new GetProductByIdResponse(product);
    }

    @Override
    public Class<GetProductByIdRequest> getRequestType() {
        return GetProductByIdRequest.class;
    }
}
