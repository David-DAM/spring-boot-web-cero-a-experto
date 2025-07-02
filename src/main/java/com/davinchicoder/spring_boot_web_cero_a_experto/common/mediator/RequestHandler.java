package com.davinchicoder.spring_boot_web_cero_a_experto.common.mediator;

public interface RequestHandler<T extends Request<R>, R> {

    R handle(T request);

    Class<T> getRequestType();

}
