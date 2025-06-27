package com.minhaempresa.fundamentos.controle_de_fluxo;

import java.util.Locale;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("DIA DA SEMANA: "+escolherDiaSemana(3).toUpperCase(Locale.ROOT));
    }

    public static String escolherDiaSemana(int dia){
        return switch(dia){
            case 1 ->  "Domingo";
            case 2 ->  "Segunda";
            case 3 ->  "Terça";
            case 4 ->  "Quarta";
            case 5 ->  "Quinta";
            case 6 ->  "Sexta";
            case 7 ->  "Sábado";
            default -> "Não encontrado ou não existe";
        };
    }
}
