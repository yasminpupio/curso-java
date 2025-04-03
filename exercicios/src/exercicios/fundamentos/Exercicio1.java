package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
		
		System.out.printf("Soma => %.2f\n", soma);
		System.out.printf("Subtração => %.2f\n", subtracao);
		System.out.printf("Multiplicação => %.2f\n", multiplicacao);
		System.out.printf("Divisão => %.2f", divisao);
		
		entrada.close();
	}
}
