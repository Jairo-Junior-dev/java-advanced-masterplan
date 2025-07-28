package com.minhaempresa.design_patterns_solid.solid.lsp.badway;

public class WAppNotificacao extends EnviarMensagem {

    @Override
    protected void enviarMensagem(String mensagem) {
        throw  new IllegalArgumentException("Método não pode ser utilizado");
    }
}
