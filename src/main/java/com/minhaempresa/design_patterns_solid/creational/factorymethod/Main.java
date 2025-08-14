package com.minhaempresa.design_patterns_solid.creational.factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loja loja = new LojaEletrodomesticos("catalogo.json");
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Listar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Histórico de vendas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: loja.listarEstoque(); break;
                case 2:
                    System.out.print("Digite o código do produto: ");
                    int cod = sc.nextInt();
                    loja.vender(cod);
                    break;
                case 3: loja.mostrarHistorico(); break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
