package com.minhaempresa.design_patterns_solid.behavioral.chainofresponsibility;

public interface Middleware {
    void next(PessoaRequest request,ErrorResponse response,ChainOfResponsibility chainOfResponsibility);
}
