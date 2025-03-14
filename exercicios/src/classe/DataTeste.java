package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 01;
		d1.ano = 2003;
		
		Data d2 = new Data();
		d2.dia = 05;
		d2.mes = 07;
		d2.ano = 2004;
		
		String dataFormatada = d1.obterDataFormatada();
		String dataFormatada2 = d2.obterDataFormatada();
		
		System.out.println(dataFormatada);
		System.out.println(dataFormatada2);
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
