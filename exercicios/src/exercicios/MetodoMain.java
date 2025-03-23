package exercicios;

public class MetodoMain {

	public static void main(String[] args) {

		Banco banco = new Banco();

		ContaBancaria conta1 = new ContaBancaria("12345", "Yasmin", 100);
		conta1.exibirSaldo();
		conta1.depositar(200);
		conta1.exibirSaldo();
		conta1.sacar(50);
		conta1.exibirSaldo();
		banco.adicionarConta(conta1);
		banco.buscarConta("12345");
		banco.buscarConta("123456");
	}
}
