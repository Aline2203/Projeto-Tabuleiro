package Regras.Movimento;

import Regras.Regras;
import entidades.Tabuleiro;
import entidades.pecas.Peca;

public class MovimentoSimples implements Regras{
	
	private Tabuleiro tabu;
	
	public MovimentoSimples(Tabuleiro ta) {
		tabu=ta;
	}

	public void mover(Peca peca, int posicaoInicialColuna, int posicaoInicialLinha, int PosicaoFinalColuna,
			int posicaoFinalLinha) {
		
		tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha] = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha];
		tabu.imprimirTabuleiro();
	}

}
