package fundamentos;

import java.util.Scanner;

public class FahrenheitCelsius {
	
	public static void main(String[] args) {
		// (x°F - 32) * 5 / 9
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em °F: ");
		String fahrenheit = entrada.next().replace(",", ".");
		
		double fahrenheit2 = Double.parseDouble(fahrenheit);
		
		double celsius = (fahrenheit2 - 32) * 5 / 9;
		
		System.out.printf("%.2f°F = %.2f°C", fahrenheit, celsius);
		
		entrada.close();		
	}
}
