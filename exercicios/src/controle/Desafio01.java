package controle;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número de 0 a 10: ");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.printf("O número %d é par", numero);
			} else {
				System.out.printf("O número %d é ímpar", numero);
			}
		} else {
			System.out.printf("O número %d não está no intervalo de 0 a 10", numero);
		}

		entrada.close();
	}
}
