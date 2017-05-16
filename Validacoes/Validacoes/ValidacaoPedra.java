package Validacoes;

import entidades.Tabuleiro;
import entidades.pecas.CasaBloqueada;
import entidades.pecas.CasaValida;
import entidades.pecas.Peca;
import excecoes.DamasException;

public class ValidacaoPedra{

	public void casaValida(Tabuleiro tabu, int posicaoColuna, int posicaoLinha) throws DamasException {
		if (tabu.localizar(posicaoColuna, posicaoLinha).getClass() == CasaBloqueada.class) {
			throw new DamasException("Posicao Invalida");
		}
		if (tabu.localizar(posicaoColuna, posicaoLinha).getClass() != CasaValida.class) {
			throw new DamasException("Posicao Invalida");
		}
	}
	
	
	/** mostrar 
	 * @param tabu
	 * @param movimento deve ser 1 para a direita e -1 para a esquerda 
	 */
	public boolean proximaCasa(Tabuleiro tabu, int posicaoColuna, int posicaoLinha, int movimento){
		return false;
		
		
		
	}

}
