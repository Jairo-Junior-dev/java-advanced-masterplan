package com.minhaempresa.design_patterns_solid.creational.factorymethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    private Aparelhos aparelho;
    private LocalDateTime dataHora;

    public Venda(Aparelhos aparelho) {
        this.aparelho = aparelho;
        this.dataHora = LocalDateTime.now();
    }

    public String toString() {
        return "[" + dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "] "
                + aparelho.getNome() + " - R$ " + aparelho.getPreco();
    }
}

