package com.minhaempresa.fundamentos.poo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Maria", "maria@email.com", "2023001");
        Estudante e2 = new Estudante("João", "joao@email.com", "2023002");
        e1.setNotas(Arrays.asList(8.0, 7.5, 9.0, 6.5));
        e2.setNotas(Arrays.asList(4.0, 5.5, 6.0, 3.5));
        List<Estudante> lista = List.of(e1, e2);
        System.out.println("=== Todos os Estudantes ===");
        Util.mostrarInformacoes(lista);
        System.out.println("\n=== Estudantes Aprovados (média >= 6.0) ===");
        Util.filtrarEExibir(lista, e -> e.calcularMediaAluno() >= 6.0);
    }
}
