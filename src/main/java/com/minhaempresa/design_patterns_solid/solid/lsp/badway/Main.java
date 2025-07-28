package com.minhaempresa.design_patterns_solid.solid.lsp.badway;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EnviarMensagem[] mensagems = new EnviarMensagem[3];
        mensagems[0] = new EmailNotificacao();
        mensagems[1] = new EnviarMensagem();
        mensagems[2] = new WAppNotificacao();

        mensagems[0].enviarMensagem("Enviando por Email");
        mensagems[1].enviarMensagem("Enviando pelo Sistema");
        mensagems[2].enviarMensagem("Enviando pelo WhatsApp");
    }
}
