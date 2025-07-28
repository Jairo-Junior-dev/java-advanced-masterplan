package com.minhaempresa.design_patterns_solid.solid.dip.badway;

public class Main {

    public static void main(String[] args) {
        DatabaseContexto contexto = new DatabaseContexto();
        contexto.init();
        contexto.salvarEntidade(null);
        contexto.buscarEntidades();
        contexto.fechar();


        }
    }


