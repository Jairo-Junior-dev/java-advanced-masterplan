package com.minhaempresa.design_patterns_solid.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Looger logger = Looger.getInstance();
        //Com o nivel setado so pode aparecer mensagem abaixo dele
        logger.setLevel("INFO");

        logger.debug("Essa mensagem não será exibida");
        logger.info("Aplicação iniciada");
        logger.warn("Pouco espaço em disco");
        logger.error("Erro crítico no sistema");
    }
}
