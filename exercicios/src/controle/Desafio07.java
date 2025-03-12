package controle;

import java.util.Scanner;

public class Desafio07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um número inteiro (ou negativo para sair): ");
			numero = entrada.nextInt();

			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.println("Soma até o momento: " + somadorDeNumeros);
			}
		}

		entrada.close();
	}
}
