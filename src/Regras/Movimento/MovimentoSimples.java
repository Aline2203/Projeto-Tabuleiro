package Regras.Movimento;

import Regras.Regras;
import entidades.Tabuleiro;
import entidades.pecas.CasaBloqueada;
import entidades.pecas.Peca;
import excecoes.CasaInvalidaExcetion;

public class MovimentoSimples implements Regras{
	
	private Tabuleiro tabu;
	private int posicaoFinalColunaXC = 0;
	private int posicaoFinalLinhaYL = 0;
	private int posicaoInicialXC = 0;
	private int posicaoInicialYL = 0;
	
	public MovimentoSimples(Tabuleiro ta) {
		tabu=ta;
	}

	public void mover(Peca peca, int posicaoInicialColuna, int posicaoInicialLinha, int PosicaoFinalColuna,
			int posicaoFinalLinha) {
		
		tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha] = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha];
		
		posicaoInicialXC = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha].getPosi��oXC();
		posicaoInicialYL = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha].getPosi��oYL();
		posicaoFinalColunaXC = tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha].getPosi��oXC();
		posicaoFinalLinhaYL = tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha].getPosi��oYL();
		
		tabu.imprimirTabuleiro();
	}
	/**
	 * Verifica se a casa � do tipo: bloqueada, se anda para frente.
	 * @throws CasaInvalidaExcetion
	 */
	public void regraMovimentoPedra()throws CasaInvalidaExcetion{
		//se a classe da posicao do tabuleiro escolhida for igual a casa bloqueada 
		if((tabu.getTabuleiro()[posicaoFinalLinhaYL][posicaoFinalColunaXC]instanceof CasaBloqueada)|| 
				(posicaoFinalColunaXC <= posicaoInicialXC)&&(posicaoFinalLinhaYL <= posicaoInicialYL)){
				throw new CasaInvalidaExcetion("Erro na posi��o da pedra");
		}
		
	}

}
