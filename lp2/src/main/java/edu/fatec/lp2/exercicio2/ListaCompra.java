package edu.fatec.lp2.exercicio2;

import lombok.Getter;


public class ListaCompra implements Calculavel {
	@Getter
	private final ItemCompra[] itensCompra;
	@Getter
	private final int qtdeMax;

	public ListaCompra(int qtdeMax) {
		this.qtdeMax = Math.max(0, qtdeMax);
		this.itensCompra = new ItemCompra[this.qtdeMax];
	}

	public boolean incluir(ItemCompra item) {
		if (item == null) {
			return false;
		}
		for (int i = 0; i < itensCompra.length; i++) {
			if (itensCompra[i] == null) {
				itensCompra[i] = item;
				return true;
			}
		}
		return false;
	}

	@Override
	public double calcularPreco() {
		double total = 0.0;
		for (ItemCompra ic : itensCompra) {
			if (ic != null) {
				total += ic.calcularPreco();
			}
		}
		return total;
	}
}