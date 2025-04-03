package exercicios.controle;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tentativas = 3;
		String senha = "1234";

		while (tentativas > 0) {
			System.out.println("Informe a senha correta: ");
			String senhaUsuario = entrada.next();
			
			if (senha.equals(senhaUsuario)) {
				System.out.println("Login efetuado com sucesso! Bem-vindo ao sistema.");
				break;
			} else {
				tentativas--;
				System.out.println("Senha incorreta! Tentativas restantes: " + tentativas);
			}
			
			if (tentativas == 0) {
				System.out.println("Usuário bloqueado!");
			}
		}		

		entrada.close();
	}
}
