package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.Mediator;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.application.command.create.CreateProductRequest;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getById.GetProductByIdRequest;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getById.GetProductByIdResponse;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api.dto.ProductDto;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController implements ProductApi {

    private final Mediator mediator;

    private final ProductMapper productMapper;

    @GetMapping("")
    public ResponseEntity<List<ProductDto>> getAllProducts(@RequestParam(required = false) String pageSize) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {

        GetProductByIdResponse response = mediator.dispatch(new GetProductByIdRequest(id));

        ProductDto productDto = productMapper.mapToProduct(response.getProduct());

        return ResponseEntity.ok(productDto);
    }

    @PostMapping("")
    public ResponseEntity<Void> saveProduct(@RequestBody ProductDto productDto) {

        CreateProductRequest request = productMapper.mapToCreateProductRequest(productDto);

        mediator.dispatch(request);

        return ResponseEntity.created(URI.create("/api/v1/products/".concat(productDto.getId().toString()))).build();
    }

    @PutMapping("")
    public ResponseEntity<Void> updateProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {


        return ResponseEntity.noContent().build();
    }


}
