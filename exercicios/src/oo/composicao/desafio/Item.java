package oo.composicao.desafio;

public class Item {

	final Produto produto;
	final int quantidade;
	
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	double obterValorTotal() {
		double total = 0;
		total = produto.preco * quantidade;
		return total;
	}
}
