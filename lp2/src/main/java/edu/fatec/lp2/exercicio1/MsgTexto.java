package edu.fatec.lp2.exercicio1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
        setHoraEnvio(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        this.numChar = conteudo == null ? 0 : conteudo.length();
        return this;
    }
}