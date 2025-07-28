package com.minhaempresa.design_patterns_solid.solid.lsp.niceway;

public class EmailNotificacao implements EnviarMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Email: "+mensagem);
    }
}
