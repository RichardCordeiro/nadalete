package edu.fatec.lp2.exercicio1;

import java.time.LocalDateTime;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario) {
        super(destinatario);
    }

    public int getNumChar() {
        return numChar;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        setConteudo(conteudo);
        setHoraEnvio(LocalDateTime.now());
        this.numChar = conteudo == null ? 0 : conteudo.length();
        return this;
    }
}