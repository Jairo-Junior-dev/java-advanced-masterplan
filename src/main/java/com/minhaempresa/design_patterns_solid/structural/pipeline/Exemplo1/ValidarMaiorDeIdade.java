package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo1;

public class ValidarMaiorDeIdade implements Step{
    @Override
    public boolean validar(Pessoa pessoa) {
        return pessoa.getIdade()>= 18;
    }
}
