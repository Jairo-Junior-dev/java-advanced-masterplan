package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo1;

public class Main {
    public static void main(String[] args) {


    Pessoa p = new Pessoa();
        p.setNome("João");
        p.setEmail("joao@email.com");
        p.setPassword("12345");
        p.setIdade(22);

    Pipeline pipeline = new Pipeline();
        pipeline.addStep(new ValidarNome());
        pipeline.addStep(new ValidarEmail());
        //pipeline.addStep(new ValidarCaracteresPassword());
        pipeline.addStep(new ValidarMaiorDeIdade());

    boolean valido = pipeline.execute(p);
        System.out.println("Cadastro válido? " + valido);
}
}
