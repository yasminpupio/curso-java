package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // Conversão explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // Conversão explícita (CAST)
		System.out.println(f);
	}

}
