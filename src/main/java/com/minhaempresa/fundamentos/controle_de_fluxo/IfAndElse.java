package com.minhaempresa.fundamentos.controle_de_fluxo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IfAndElse {
    public static void main(String[] args) {
            Map<String, Integer> pessoas = Map.of(
                "Maria", 15,
                "João", 25,
                "Pedro", 65,
                "Ana", 70,
                "Lucas", 40
        );
        var grupos = mostrarNomeIdadeDaPessoaEGrupo(pessoas);
        System.out.println(grupos);
        int i = 39;

        String[] res = {"PAR","IMPAR"};
        System.out.println(res[i%2]);
        System.out.println(i % 2 ==0 ? "Par":"Impar");

    }

    public static Map<String, List<String>> mostrarNomeIdadeDaPessoaEGrupo(Map<String, Integer> pessoas) {
        return pessoas.entrySet().stream()
                .collect(Collectors.groupingBy(
                        entry -> {
                            int idade = entry.getValue();
                            if (idade < 18) return "Menor de idade";
                            else if (idade < 60) return "Adulto";
                            else return "Idoso";
                        },
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));
    }
}
