package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.Mediator;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.application.ProductCreateRequest;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController implements ProductApi {

    private final Mediator mediator;

    @GetMapping("")
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam(required = false) String pageSize) {
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> productOptional = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        if (productOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(productOptional.get());
    }

    @PostMapping("")
    public ResponseEntity<Void> saveProduct(@RequestBody Product product) {

        mediator.dispatch(new ProductCreateRequest(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImage()));

        return ResponseEntity.created(URI.create("/api/v1/products/".concat(product.getId().toString()))).build();
    }

    @PutMapping("")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {

        Product productSelected = products.stream()
                .filter(p -> p.getId().equals(product.getId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));

        productSelected.setName(product.getName());
        productSelected.setDescription(product.getDescription());
        productSelected.setPrice(product.getPrice());
        productSelected.setImage(product.getImage());

        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {

        products.removeIf(p -> p.getId().equals(id));

        return ResponseEntity.noContent().build();
    }


}
