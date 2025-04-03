package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);

		entrada.close();
	}
}
