package fundamentos;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu peso em kg: ");
		String valor1 = entrada.next().replace(",", ".");
		double peso = Double.parseDouble(valor1);
		
		System.out.print("Digite a sua altura em metros: ");
		String valor2 = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(valor2);
		
		// Lógica 
		double imc = peso / Math.pow(altura, 2);
		
		String resultado = imc <= 18.5 ? "abaixo do peso" : "não informado";
		resultado = imc >= 18.6 && imc <= 24.9 ? "peso normal" : resultado;
		resultado = imc >= 25 && imc <= 29.9 ? "sobrepeso" : resultado;
		resultado = imc >= 30 && imc <= 34.9 ? "obesidade grau I" : resultado;
		resultado = imc >= 35 && imc <= 39.9 ? "obesidade grau II" : resultado;
		resultado = imc >= 40 ? "obesidade grau III" : resultado;
		
		System.out.printf("IMC = %.2f - %s", imc, resultado);
		
		entrada.close();
	}

}
