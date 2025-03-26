package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Monstro j1 = new Monstro();
		j1.x = 10;
		j1.y = 10; 
		
		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 12;
		
		System.out.println("Vida Monstro: " + j1.vida);
		System.out.println("Vida Herói: " + j2.vida);
	
		j1.atacar(j2);
		System.out.println("Monstro atacou o herói!");
		System.out.println("Vida Monstro: " + j1.vida);
		System.out.println("Vida Herói: " + j2.vida);
		j2.atacar(j1);
		System.out.println("Herói atacou o monstro!");
		System.out.println("Vida Monstro: " + j1.vida);
		System.out.println("Vida Herói: " + j2.vida);
		
//		j1.andar("norte");
//		j1.andar("norte");
//		j1.andar("norte");
//		j1.andar("norte");
		
//		j1.andar(1);
//		j1.andar(1);
//		j1.andar(1);
//		j1.andar(1);
	}
}
