package fundamentos;

import java.util.Scanner;

public class CelsiusFahrenheit {
	
	public static void main(String[] args) {
		// (x°C * 9/5) + 32
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em °C: ");
		String valor = entrada.next().replace(",", ".");
		
		double celsius = Double.parseDouble(valor);
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);
		
		entrada.close();
	}

}
