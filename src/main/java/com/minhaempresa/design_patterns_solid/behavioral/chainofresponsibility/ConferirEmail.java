package com.minhaempresa.design_patterns_solid.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class ConferirEmail implements Middleware {
    @Override
    public void next(PessoaRequest request, ErrorResponse response, ChainOfResponsibility chainOfResponsibility) {
        List<String> ERRORS = new ArrayList<>();
        if(request.getEmail().length()<=6) {
            ERRORS.add(" Error: email com menos de 6 caracteres");
        } if (!request.getEmail().matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            ERRORS.add(" Error: Formato de email não válido");
        }if (request.getEmail() == null){
            ERRORS.add("Error: Email nao pode ser nulo ");
        }
        response.addError(this.getClass(), ERRORS);
        chainOfResponsibility.next(request, response);
    }
}
