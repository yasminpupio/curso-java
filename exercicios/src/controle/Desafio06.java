package controle;

import java.util.Random;
import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroSorteado;
		int tentativas;
		int continuar;
		int numero;

		do {
			System.out.println("Sorteando número entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo! Será que consegue me vencer?");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();

				if (numero > numeroSorteado) {
					System.out.printf("O número sorteado é menor que %d\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("O número sorteado é maior que %d\n", numero);
				} else {
					System.out.printf("Parabéns você acertou o número em %d tentativas!\n", tentativas);
					break;
				}
			} while (tentativas < 10);

			System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
			continuar = entrada.nextInt();

		} while (continuar != 0);

		entrada.close();
	}
}
