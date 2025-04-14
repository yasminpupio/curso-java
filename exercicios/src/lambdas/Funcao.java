package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		// Recebe 2 parâmetros: 1 de entrada e 1 de saída
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(33));
	}
}
