package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		// (base * altura) / 2
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a base do trinângulo: ");
		String valor1 = entrada.next().replace(",", ".");
		double base = Double.parseDouble(valor1);
		
		System.out.print("Digite a altura do triângulo: ");
		String valor2 = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(valor2);
		
		// Lógica
		double area = (base * altura) / 2;
		
		System.out.printf("Área do triângulo = %.2fcm2", area);
		
		entrada.close();
	}

}
