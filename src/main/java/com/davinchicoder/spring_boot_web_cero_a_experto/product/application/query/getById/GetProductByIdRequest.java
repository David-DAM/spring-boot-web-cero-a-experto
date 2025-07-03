package com.davinchicoder.spring_boot_web_cero_a_experto.product.application.query.getById;

import com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetProductByIdRequest implements Request<GetProductByIdResponse> {

    private Long id;
}
