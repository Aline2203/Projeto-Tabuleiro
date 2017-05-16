package entidades;

import Regras.Regras;
import Regras.Movimento.MovimentoSimples;
import excecoes.DamasException;

public class Jogo {

	private Regras regras;

	private Jogardor jogador1;
	private Jogardor jogador2;
	
	public static void main(String[] args) {
		try {
			Tabuleiro tabu = new Tabuleiro(12);
			tabu.preecherTabuleiro();
			tabu.imprimirTabuleiro();
		} catch (DamasException e) {
			System.out.println(e.getMessage());
		}
		
		

		// mover.mover(peca, posicaoInicialColuna, posicaoInicialLinha,
		// PosicaoFinalColuna, posicaoFinalLinha);

	}

}
