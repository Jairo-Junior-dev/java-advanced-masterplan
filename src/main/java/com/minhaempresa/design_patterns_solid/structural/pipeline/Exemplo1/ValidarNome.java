package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo1;

public class ValidarNome  implements Step {
    @Override
    public boolean validar(Pessoa pessoa) {
        String nome = pessoa.getNome();
        return nome != null && !nome.trim().isEmpty();
    }
}