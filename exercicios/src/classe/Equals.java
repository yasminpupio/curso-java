package classe;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Yasmin";
		u1.email = "yasmin@email.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Yasmin";
		u2.email = "yasmin@email.com.br";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

//		System.out.println(u2.equals(new Date()));
	}
}
