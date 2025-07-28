package com.minhaempresa.design_patterns_solid.solid.lsp.niceway;

public class NotificacaoSistema implements EnviarMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Sistema: "+mensagem);
    }
}
