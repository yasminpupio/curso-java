package exercicios;

public class Carro {

	String marca;
	String modelo;
	int ano;
	double velocidadeAtual;

	Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		velocidadeAtual = 0;
	}

	void acelerar(double aceleracao) {
		if (aceleracao > 0.00) {
			velocidadeAtual += aceleracao;
			System.out.println("A velocidade atual do carro é de " + velocidadeAtual + " km/h");
		} else {
			System.out.println("Valor inválido para aceleração");
		}
	}

	void frear(double frenagem) {
		if (frenagem > 0 && frenagem <= velocidadeAtual) {
			velocidadeAtual -= frenagem;
			System.out.println("A velocidade atual do carro é de " + velocidadeAtual + " km/h");
		} else if (frenagem > 0 && frenagem > velocidadeAtual) {
			System.out.println("O carro parou");
		} else {
			System.out.println("Valor inválido para frenagem");
		}
	}
	
	void exibirInformacoes() {
		System.out.printf("Carro: %s %s (ano: %d)\n", marca, modelo, ano);
		System.out.printf("Valocidade Atual: %.2f km/h\n", velocidadeAtual);
	}
	
	public static void main(String[] args) {
		Carro c1 = new Carro("Hyundai", "Elantra", 2014);
		
		c1.exibirInformacoes();
		c1.acelerar(30);
		c1.frear(20);
		c1.exibirInformacoes();
	}
}
