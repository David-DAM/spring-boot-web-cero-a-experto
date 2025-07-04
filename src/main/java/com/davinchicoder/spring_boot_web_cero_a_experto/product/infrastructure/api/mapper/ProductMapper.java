package com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api.mapper;

import com.davinchicoder.spring_boot_web_cero_a_experto.product.application.command.create.CreateProductRequest;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.application.command.update.UpdateProductRequest;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.domain.Product;
import com.davinchicoder.spring_boot_web_cero_a_experto.product.infrastructure.api.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductMapper {

    CreateProductRequest mapToCreateProductRequest(ProductDto productDto);

    UpdateProductRequest mapToUpdateProductRequest(ProductDto productDto);

    ProductDto mapToProduct(Product product);

}
