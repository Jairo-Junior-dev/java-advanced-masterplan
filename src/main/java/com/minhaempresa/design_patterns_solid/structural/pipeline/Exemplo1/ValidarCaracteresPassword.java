package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo1;

public class ValidarCaracteresPassword
implements Step{
    @Override
    public boolean validar(Pessoa pessoa) {
        return pessoa.getPassword().length() >= 8;
    }
}
