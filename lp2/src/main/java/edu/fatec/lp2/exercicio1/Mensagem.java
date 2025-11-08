package edu.fatec.lp2.exercicio1;



public abstract class Mensagem {
	private Contatinho destinatario;
	private String horaEnvio;
	private String conteudo;

	protected Mensagem(Contatinho destinatario) {
		this.destinatario = destinatario;
	}

	public Contatinho getDestinatario() {
		return destinatario;
	}

	public String getHoraEnvio() {
		return horaEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	protected void setHoraEnvio(String horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	protected void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public abstract Mensagem sendMessage(String conteudo);
}