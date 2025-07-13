package com.minhaempresa.colecoes_generics.list_set_map.map;

import com.minhaempresa.fundamentos.enums_records.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {

    private static Map<String, List<Pessoa>> pessoas = new HashMap<>();

    public static void main(String[] args) {
        pessoas.put("cidade1", List.of(
                new Pessoa("Ana", 17),
                new Pessoa("Bruno", 22)
        ));
        pessoas.put("cidade2", List.of(
                new Pessoa("Carlos", 30),
                new Pessoa("Duda", 15)
        ));

        Map<String, List<Pessoa>> resultado = separarPorIdade();

        System.out.println("Maiores de idade:");
        resultado.get("maiores").forEach(p -> System.out.println(p.nome() + " - " + p.idade()));

        System.out.println("\nMenores de idade:");
        resultado.get("menores").forEach(p -> System.out.println(p.nome() + " - " + p.idade()));
    }

    public static Map<String, List<Pessoa>> separarPorIdade() {
        return pessoas.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors
                        .partitioningBy(p -> p.idade() >= 18))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(e -> e.getKey() ? "maiores" : "menores",
                        Map.Entry::getValue
                ));
    }
}
