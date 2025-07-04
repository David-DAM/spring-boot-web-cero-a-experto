package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getAll;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.RequestHandler;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.entity.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllProductHandler implements RequestHandler<GetAllProductRequest, GetAllProductResponse> {

    private final ProductRepository productRepository;

    @Override
    public GetAllProductResponse handle(GetAllProductRequest request) {


        List<Product> products = productRepository.findAll();

        return new GetAllProductResponse(products);
    }

    @Override
    public Class<GetAllProductRequest> getRequestType() {
        return GetAllProductRequest.class;
    }
}
