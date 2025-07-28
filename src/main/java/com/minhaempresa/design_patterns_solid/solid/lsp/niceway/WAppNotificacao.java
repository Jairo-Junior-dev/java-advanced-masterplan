package com.minhaempresa.design_patterns_solid.solid.lsp.niceway;

public class WAppNotificacao implements EnviarMensagem{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("WhatsApp: "+mensagem);
    }
}
