package oo.heranca;

public class Jogador {

	int x;
	int y;

//	boolean andar(String direcao) {
//		if ("norte".equalsIgnoreCase(direcao)) {
//			y++;
//		}
//		return true;
//	}

//	boolean andar(int direcao) {
//		if (direcao == 1) {
//			y++;
//		}
//		return true;
//	}

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}

//		if (direcao == Direcao.NORTE) {
//			y++;
//		}
		
		return true;
	}
}
