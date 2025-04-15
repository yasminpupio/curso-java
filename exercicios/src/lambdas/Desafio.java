package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56 
		 */
		
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;	
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		Function<Double, String> formatar = preco -> "R$" + new DecimalFormat("###,##0.00").format(preco);
		String precoFinal = precoReal
							.andThen(impostoMunicipal)
							.andThen(frete)
							.andThen(arredondar)
							.andThen(formatar)
							.apply(p);
		
		System.out.println(precoFinal);
	} 
}
