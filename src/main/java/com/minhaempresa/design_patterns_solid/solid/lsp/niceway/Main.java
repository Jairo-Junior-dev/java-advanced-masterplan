package com.minhaempresa.design_patterns_solid.solid.lsp.niceway;

public class Main {
    public static void main(String[] args) {
        EnviarMensagem[] mensagens = { new EmailNotificacao(), new WAppNotificacao(),new NotificacaoSistema()
};
        /*
        mensagens[0].enviarMensagem("Enviando por Email");
        mensagens[1].enviarMensagem("Enviando pelo WhatsApp");
        */
        for (int index = 0; index < mensagens.length; index++) {
            mensagens[index].enviarMensagem("Olá");
        }
    }
}
