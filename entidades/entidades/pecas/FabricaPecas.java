package entidades.pecas;

import excecoes.DamasException;

public abstract class FabricaPecas {

	public static Peca criarPeca(String peca,String cor){
		
		switch (peca) {
		case "Pedra":
			return new Pedra(cor);

		case "Dama":
			return new Dama(cor);
			
		case "CasaBloqueada":
			return new CasaBloqueada(cor);
			
		default:
			return new CasaValida(cor);
		}
		
		
		
		
	}
	
}
