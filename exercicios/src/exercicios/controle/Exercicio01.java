package exercicios.controle;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o número da tabuada que deseja: ");
		int num = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int mutiplicacao = num * i;
			System.out.printf("%d x %d = %d\n", num, i, mutiplicacao);
		}

		entrada.close();
	}
}
