package exercicios;

public class ContaBancaria {

	String numeroConta;
	String titular;
	double saldo;

	ContaBancaria(String numeroConta, String titular, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numeroConta;
	}

	void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.printf("R$%.2f depositado com sucesso!\n", valor);
		} else {
			System.out.println("Valor inválido");
		}
	}

	void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.printf("R$%.2f sacado com sucesso!\n", valor);
		} else if (valor > 0 && valor > saldo) {
			System.out.println("O valor que deseja sacar é maior que o saldo");
		} else {
			System.out.println("Valor inválido");
		}
	}

	void exibirSaldo() {
		System.out.printf("Conta: %s | Titular: %s | Saldo: R$%.2f\n", numeroConta, titular, saldo);
	}

	String getNumeroConta() {
		return numeroConta;
	}
}
