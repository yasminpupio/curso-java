package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem("Notebook", 2000, 2);
	
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem("Impressora", 1000, 1);
		
		Cliente cliente1 = new Cliente("Yasmin Pupio");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println("Valor Total das Compras: " + cliente1.obterValorTotal());
		System.out.println("Valor Total da Compra 1: " + compra1.obterValorTotal());
		System.out.println("Valor Total da Compra 2: " + compra2.obterValorTotal());
	}
}
