package fundamentos;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
		// delta = b2 - 4ac
		// x = (-b +- raizDelta) / (2 * a) 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equação: ax2 + bx + c = 0");
		
		System.out.print("Digite o valor de A: ");
		int a = entrada.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = entrada.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int c = entrada.nextInt();
		
		System.out.printf("Equação: %dx2 + %dx + %d = 0\n", a, b, c);
		
		// Lógica
		int delta = (int) Math.pow(b, 2) - (4 * a * c);
		System.out.println("O delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("O x1 é: %.2f\n", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("O x2 é: %.2f", x2);
		
		entrada.close();
	}

}
