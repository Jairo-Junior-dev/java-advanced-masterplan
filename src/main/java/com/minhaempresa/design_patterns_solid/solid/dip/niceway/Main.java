package com.minhaempresa.design_patterns_solid.solid.dip.niceway;

public class Main {

    public static void main(String[] args) {
        // Caso eu queira usar o Msql
        DatabaseContexto contexto = new DatabaseContexto(new DatabaseMySQLImpl());
        // Caso eu queira usar o Postgres
        DatabaseContexto contexto2 = new DatabaseContexto(new DatabasePostgresImpl());
        contexto.init();
        contexto.salvarEntidade(null);
        contexto.buscarEntidades();
        contexto.fechar();
        }
    }


