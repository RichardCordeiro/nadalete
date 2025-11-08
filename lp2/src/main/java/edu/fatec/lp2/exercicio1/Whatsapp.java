package edu.fatec.lp2.exercicio1;

public class Whatsapp {
	private Contatinho[] contatos;
	private Mensagem[] mensagens;

	public Whatsapp(int capacidadeContatos, int capacidadeMensagens) {
		this.contatos = new Contatinho[Math.max(0, capacidadeContatos)];
		this.mensagens = new Mensagem[Math.max(0, capacidadeMensagens)];
	}

	public boolean adicionarContato(Contatinho contato) {
		if (contato == null) return false;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato;
				return true;
			}
		}
		return false;
	}

	public boolean enviarMensagem(Mensagem mensagem) {
		if (mensagem == null) return false;
		for (int i = 0; i < mensagens.length; i++) {
			if (mensagens[i] == null) {
				mensagens[i] = mensagem;
				return true;
			}
		}
		return false;
	}

	public void listarContatos() {
		for (Contatinho c : contatos) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}

	public void listarMensagens() {
		for (Mensagem m : mensagens) {
			if (m != null) {
				System.out.println(m);
			}
		}
	}
}