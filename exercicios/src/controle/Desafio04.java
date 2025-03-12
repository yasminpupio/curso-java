package controle;

import java.util.Scanner;

public class Desafio04 {

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

		if (contadorDeDivisores == 0) {
			System.out.println("O número " + numero + " é primo");
		} else {
			System.out.println("O número " + numero + " não é primo");
		}

		entrada.close();
	}
}
