package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d é par!", num);
		} else {
			System.out.printf("O número %d é ímpar", num);
		}

		entrada.close();
	}
}
