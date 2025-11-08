package edu.fatec.lp2.exercicio1;

import java.time.LocalDateTime;

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
		setHoraEnvio(LocalDateTime.now());
		return this;
	}
}