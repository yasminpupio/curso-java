package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	List<ContaBancaria> contas;

	Banco() {
		this.contas = new ArrayList<ContaBancaria>();
	}

	void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
		System.out.printf("Conta adicionada com sucesso: %s\n", conta.getNumeroConta());
	}

	void buscarConta(String numeroConta) {
		for (ContaBancaria conta : contas) {
			if (conta.getNumeroConta().equals(numeroConta)) {
				System.out.printf("Conta encotrada com sucesso: %s\n", conta);
			} else {
				System.out.println("Conta não encontrada, verifique!");
			}
		}
	}
}
