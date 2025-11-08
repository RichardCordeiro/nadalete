package edu.fatec.lp2.exercicio2;

import lombok.Data;


@Data
public class ItemCompra implements Calculavel {
	private int quantidade;
	private Produto produto;
	private double desconto;

	public ItemCompra(Produto produto, double desconto) {
		this.produto = produto;
		this.desconto = desconto;
		this.quantidade = 1;
	}

	@Override
	public double calcularPreco() {
		if (produto == null || quantidade <= 0) {
			return 0.0;
		}
		double descontoAplicavel = Math.max(0.0, Math.min(desconto, produto.getDescontoMaximo()));
		double precoUnitarioComDesconto = produto.getPreco() * (1.0 - descontoAplicavel);
		return precoUnitarioComDesconto * quantidade;
	}
}