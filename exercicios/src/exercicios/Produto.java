package exercicios;

public class Produto {

	String nome;
	double preco;
	int quantidadeEmEstoque;

	Produto(String nome, double preco, int estoqueInicial) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = estoqueInicial;
	}

	void adicionarEstoque(int quantidade) {
		if (quantidade > 0) {
			quantidadeEmEstoque += quantidade;
			System.out.printf("%d adicionado ao estoque com sucesso\n", quantidade);
		} else {
			System.out.println("Quantidade Inválida");
		}
	}

	void vender(int quantidade) {
		if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
			quantidadeEmEstoque -= quantidade;
			System.out.printf("%d produtos vendidos com sucesso!\n", quantidade);
		} else if (quantidade > 0 && quantidade > quantidadeEmEstoque) {
			System.out.println("A quantidade informada excede a quantidade em estoque");
		} else {
			System.out.println("Quantidade inválida");
		}
	}
	
	void exibirDetalhes() {
		System.out.printf("Nome: %s | Preço: R$%.2f | Quantidade em Estoque: %d\n", nome, preco, quantidadeEmEstoque);
	}
	
	public static void main(String[] args) {
		Produto p1 = new Produto("Lápis", 2.0, 10);
		p1.exibirDetalhes();
		p1.adicionarEstoque(5);
		p1.exibirDetalhes();
		p1.vender(3);
		p1.exibirDetalhes();
	}
}
