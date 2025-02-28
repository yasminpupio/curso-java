package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if (...) senteça; ou {}
		// while (...) sentença; ou {}
		// for (inicialização; expressão; modificação;) sentença; ou {}

		// do {} while (...);

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}
}
