package Validacoes;

import entidades.Tabuleiro;
import excecoes.DamasException;

public abstract class ValidacaoPedra{

	public void casaValida(Tabuleiro tabu, int posicaoColuna, int posicaoLinha) throws DamasException {
	}
	
	public static void verificarParametros(String id) throws DamasException{
		if(id==null||id.equals(""))
			throw new DamasException("O ID da partida informado e invalido");
	}
	
	
	
	/** mostrar 
	 * @param tabu
	 * @param movimento deve ser 1 para a direita e -1 para a esquerda 
	 */
	public boolean proximaCasa(Tabuleiro tabu, int posicaoColuna, int posicaoLinha, int movimento){
		return false;
		
		
		
	}

}
