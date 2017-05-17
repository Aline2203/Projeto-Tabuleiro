package Regras.Movimento;

import Regras.Regras;
import entidades.Tabuleiro;
import entidades.pecas.CasaBloqueada;
import entidades.pecas.CasaValida;
import entidades.pecas.Dama;
import entidades.pecas.Peca;
import entidades.pecas.Pedra;
import excecoes.DamasException;

public class MovimentoSimples implements Regras{
	
	private Tabuleiro tabu;
	
	
	public MovimentoSimples(Tabuleiro ta) {
		tabu=ta;
	}

	//não pular casa a nao ser que seja captura, verificar se tem peca n posicao,casa bloqueada, fora do array
	//
	public void mover(Peca peca, int posicaoInicialColuna, char posicaoInicialLinha, int PosicaoFinalColuna,
			char posicaoFinalLinha) {
		
		tabu.mudarPosicao(posicaoInicialColuna,posicaoInicialLinha, posicaoInicialColuna, posicaoFinalLinha);
		
	}
	/**
	 * Verifica se a casa é do tipo: bloqueada, se anda para frente.
	 * @throws CasaInvalidaExcetion
	 */
	public void regraMovimentoPedra()throws DamasException{
		
		
	}
/**
 * Verifica se já existe uma pedra ou uma Dama na posição final de destino
 * @throws CasaInvalidaExcetion
 */
	public void verificarOutraPedraOuDamaNaPosicao() throws DamasException{	
		
	}
	
	
	public void pularCasa(){
		
	}
	
	/**
	 * verifica posição de destino das pedras do tabuleiro se está fora do vetor
	 * @throws TamanhoInvalido retorna mensagem indicando tamanho invalido para alocar a pedra
	 */
	public void verificarPedraforaDoArray()throws DamasException{
	}
	
}
