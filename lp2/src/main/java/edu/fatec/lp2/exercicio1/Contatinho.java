package edu.fatec.lp2.exercicio1;

public class Contatinho {
	private final String nome;
	private final String celular;

	public Contatinho(String nome, String celular) {
		this.nome = nome;
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}

	public String getCelular() {
		return celular;
	}
}