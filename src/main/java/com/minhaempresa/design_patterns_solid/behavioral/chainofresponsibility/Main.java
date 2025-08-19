package com.minhaempresa.design_patterns_solid.behavioral.chainofresponsibility;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MiddlewareManager middlewareManager = new MiddlewareManager(Arrays.asList(new ConferirEmail()));
        PessoaRequest pessoaRequest = new PessoaRequest();
        pessoaRequest.setEmail("sdas");
        pessoaRequest.setNome("Jairo");
        pessoaRequest.setIdade(28);
        pessoaRequest.setPassword("dsadadadadad");
        ErrorResponse errorResponse = new ErrorResponse();
        middlewareManager.next(pessoaRequest,errorResponse);
        errorResponse.detalharInfor();
    }
}
