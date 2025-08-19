package com.minhaempresa.design_patterns_solid.behavioral.chainofresponsibility;

import java.util.List;

public class MiddlewareManager implements ChainOfResponsibility {
    private final List<Middleware> middlewares;
    private int index = 0;

    public MiddlewareManager(List<Middleware> middlewares) {
        this.middlewares = middlewares;
    }

    @Override
    public void next(PessoaRequest request, ErrorResponse response) {
        if (index < middlewares.size()) {
            Middleware current = middlewares.get(index++);
            current.next(request, response, this);
        }
    }
}
