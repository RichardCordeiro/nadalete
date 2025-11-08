package edu.fatec.lp2.exercicio1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MsgAudio extends Mensagem {
	private int duracao;

	public MsgAudio(Contatinho destinatario, int duracao) {
		super(destinatario);
		this.duracao = Math.max(0, duracao);
	}

	public int getDuracao() {
		return duracao;
	}

	@Override
	public Mensagem sendMessage(String conteudo) {
		setConteudo(conteudo);
		setHoraEnvio(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		return this;
	}
}