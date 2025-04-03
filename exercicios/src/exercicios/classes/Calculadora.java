package exercicios.classes;

public class Calculadora {

	double soma(double a, double b) {
		return a + b;
	}

	double subtracao(double a, double b) {
		return a - b;
	}

	double multiplicacao(double a, double b) {
		return a * b;
	}

	double divisao(double a, double b) {
		if (b == 0) {
			System.out.println("Erro: divisão por zero!");
			return Double.NaN;
		}
		return a / b;
	}

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		c1.soma(10, 2);
		c1.subtracao(10, 2);
		c1.multiplicacao(10, 2);
		c1.divisao(10, 0);
	}
}
