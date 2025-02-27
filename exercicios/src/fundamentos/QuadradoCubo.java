package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		String num = entrada.next().replace(",", ".");
		double valor = Double.parseDouble(num);
		
		// Lógica
		double valorQuadrado = Math.pow(valor, 2);
		double valorCubo = Math.pow(valor, 3);
		
		System.out.printf("Valor digitado: %.2f\nValor ao quadrado: %.2f\nValor ao cubo: %.2f", valor, valorQuadrado, valorCubo);
		
		entrada.close();
	}
}
