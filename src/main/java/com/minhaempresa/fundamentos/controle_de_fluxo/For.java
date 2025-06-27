package com.minhaempresa.fundamentos.controle_de_fluxo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class For {

    public static void main(String[] args) {
        Map<String, Estudante> mapaEstudantes = Map.of(
                "Ana", new Estudante("Ana", 18, 85, 'F'),
                "Carlos", new Estudante("Carlos", 20, 55, 'M'),
                "Bruna", new Estudante("Bruna", 22, 70, 'F'),
                "Lucas", new Estudante("Lucas", 19, 40, 'M')
        );

        Map<String, List<Estudante>> agrupados = organizarEstudantesPelaSituacao(mapaEstudantes);
        System.out.println(organizarEstudantesPelaSituacaoString(mapaEstudantes.values().toArray(new Estudante[0])));
        /*
        agrupados.forEach((situacao, lista) -> {
            System.out.println("Situação: " + situacao);
            lista.forEach(est -> System.out.println(" - Nome: " + est.getNome() + ", Nota: " + est.getNota()));
        });*/
    }
    /* Usando Map */
    public static Map<String, List<Estudante>> organizarEstudantesPelaSituacao(Map<String , Estudante> estudantes) {
        return estudantes.values()
                .stream()
                .collect(Collectors.groupingBy(est -> est.getNota() >= 60 ? "Aprovado" : "Reprovado"));
    }

    public static String organizarEstudantesPelaSituacaoString(Estudante[] estudantes) {
        StringBuilder estudantesAprovados = new StringBuilder();
        StringBuilder estudantesReprovados = new StringBuilder();

        estudantesAprovados.append("Aprovados: [\n");
        estudantesReprovados.append("Reprovados: [\n");

        for (Estudante estudante : estudantes) {
            if (estudante.getNota() >= 60) {
                estudantesAprovados.append("  ").append(estudante).append("\n");
            } else {
                estudantesReprovados.append("  ").append(estudante).append("\n");
            }
        }

        estudantesAprovados.append("]\n");
        estudantesReprovados.append("]\n");

        return estudantesAprovados.toString() + estudantesReprovados.toString();
    }

}

 class Estudante {
    private UUID uuid;
    private String nome;
    private int idade;
    private int nota;
    private char sexo;

    public Estudante(String nome, int idade, int nota, char sexo) {
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.sexo = sexo;
    }

     @Override
     public String toString() {
         return "Estudante{" +
                 "nome='" + nome + '\'' +
                 ", idade=" + idade +
                 ", nota=" + nota +
                 ", sexo=" + sexo +
                 '}';
     }

     public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public UUID getUuid() {
        return uuid;
    }

}
