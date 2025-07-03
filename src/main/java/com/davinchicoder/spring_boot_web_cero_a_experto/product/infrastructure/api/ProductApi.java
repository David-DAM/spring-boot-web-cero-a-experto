package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api;

import com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductApi {

    ResponseEntity<List<ProductDto>> getAllProducts(@RequestParam(required = false) String pageSize);

    ResponseEntity<ProductDto> getProductById(@PathVariable Long id);

    ResponseEntity<Void> saveProduct(@RequestBody ProductDto productDto);

    ResponseEntity<Void> updateProduct(@RequestBody ProductDto productDto);

    ResponseEntity<Void> deleteProduct(@PathVariable Long id);

}
