package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo1;

public class ValidarEmail implements Step {
    @Override
    public boolean validar(Pessoa pessoa) {
        return pessoa.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

}
