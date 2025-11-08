package edu.fatec.lp2.exercicio1;

import java.time.LocalDateTime;

public abstract class Mensagem {
	private Contatinho destinatario;
	private LocalDateTime horaEnvio;
	private String conteudo;

	protected Mensagem(Contatinho destinatario) {
		this.destinatario = destinatario;
	}

	public Contatinho getDestinatario() {
		return destinatario;
	}

	public LocalDateTime getHoraEnvio() {
		return horaEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	protected void setHoraEnvio(LocalDateTime horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	protected void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public abstract Mensagem sendMessage(String conteudo);
}