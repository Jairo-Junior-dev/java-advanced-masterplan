package com.minhaempresa.fundamentos.enums_records;

public record Pessoa(String nome , int idade) {

    public Pessoa{
        if (nome == null){
            throw  new IllegalArgumentException("Nome não pode ser nulo");
        }if (idade <= 0){
            throw  new IllegalArgumentException("idade não pode ser nulo ou menor a zero ");
        }
    }

    public Pessoa(int idade){this("ANONIMO",idade);}

}
