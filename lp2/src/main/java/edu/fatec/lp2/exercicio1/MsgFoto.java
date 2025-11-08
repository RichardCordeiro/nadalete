package edu.fatec.lp2.exercicio1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MsgFoto extends Mensagem {
	private int tamanho;

	public MsgFoto(Contatinho destinatario, int tamanho) {
		super(destinatario);
		this.tamanho = Math.max(0, tamanho);
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public Mensagem sendMessage(String conteudo) {
		setConteudo(conteudo);
		setHoraEnvio(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		return this;
	}
}