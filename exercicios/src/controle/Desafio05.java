package controle;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("O número " + numero + " é primo");
			break;
		default:
			System.out.println("O número " + numero + " não é primo");
		}

		entrada.close();
	}
}
