package com.minhaempresa.design_patterns_solid.behavioral.chainofresponsibility;

public interface ChainOfResponsibility {
    void next(PessoaRequest request, ErrorResponse response);
}
