package controle;

import java.util.Scanner;

public class Desafio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maiorValor = 0;
		int valor = 0;
		int contador = 0;

		do {
			System.out.print("Digite um valor: ");
			valor = entrada.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;

		} while (contador != 10);

		System.out.println("O maior valor foi: " + maiorValor);

		entrada.close();
	}
}
