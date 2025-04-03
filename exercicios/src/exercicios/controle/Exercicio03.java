package exercicios.controle;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int num = entrada.nextInt();

		int fatorial = 1;
		int i = num;

		while (i > 1) {
			fatorial *= i;
			i--;
		}

		System.out.printf("O fatorial de %d é %d", num, fatorial);

		entrada.close();
	}
}
