package Regras.Movimento;

import Regras.Regras;
import entidades.Tabuleiro;
import entidades.pecas.CasaBloqueada;
import entidades.pecas.CasaValida;
import entidades.pecas.Dama;
import entidades.pecas.Peca;
import entidades.pecas.Pedra;
import excecoes.CasaInvalidaExcetion;
import excecoes.TamanhoInvalido;

public class MovimentoSimples implements Regras{
	
	private Tabuleiro tabu;
	private int posicaoFinalColunaXC = 0;
	private int posicaoFinalLinhaYL = 0;
	private int posicaoInicialXC = 0;
	private int posicaoInicialYL = 0;
	
	public MovimentoSimples(Tabuleiro ta) {
		tabu=ta;
	}

	//não pular casa a nao ser que seja captura, verificar se tem peca n posicao,casa bloqueada, fora do array
	//
	public void mover(Peca peca, int posicaoInicialColuna, int posicaoInicialLinha, int PosicaoFinalColuna,
			int posicaoFinalLinha) {
		
		tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha] = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha];
		
		posicaoInicialXC = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha].getPosiçãoXC();
		posicaoInicialYL = tabu.getTabuleiro()[posicaoInicialColuna][posicaoInicialLinha].getPosiçãoYL();
		posicaoFinalColunaXC = tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha].getPosiçãoXC();
		posicaoFinalLinhaYL = tabu.getTabuleiro()[PosicaoFinalColuna][posicaoFinalLinha].getPosiçãoYL();
		
		tabu.imprimirTabuleiro();
	}
	/**
	 * Verifica se a casa é do tipo: bloqueada, se anda para frente.
	 * @throws CasaInvalidaExcetion
	 */
	public void regraMovimentoPedra()throws CasaInvalidaExcetion{
		//se a classe da posicao do tabuleiro escolhida for igual a casa bloqueada 
		if((tabu.getTabuleiro()[posicaoFinalLinhaYL][posicaoFinalColunaXC]instanceof CasaBloqueada)|| 
				(posicaoFinalColunaXC <= posicaoInicialXC)&&(posicaoFinalLinhaYL <= posicaoInicialYL)){
				throw new CasaInvalidaExcetion("Erro na posição da pedra");
		}
		
	}
/**
 * Verifica se já existe uma pedra ou uma Dama na posição final de destino
 * @throws CasaInvalidaExcetion
 */
	public void verificarOutraPedraOuDamaNaPosicao() throws CasaInvalidaExcetion{	
		if((tabu.getTabuleiro()[posicaoFinalColunaXC][posicaoFinalLinhaYL] instanceof Pedra)||
				(tabu.getTabuleiro()[posicaoFinalColunaXC][posicaoFinalLinhaYL] instanceof Dama)){
			throw new CasaInvalidaExcetion("Erro na posição da pedra");
		}
	}
	public void pularCasa(){
		
	}
	
	/**
	 * verifica posição de destino das pedras do tabuleiro se está fora do vetor
	 * @throws TamanhoInvalido retorna mensagem indicando tamanho invalido para alocar a pedra
	 */
	public void verificarPedraforaDoArray()throws TamanhoInvalido{
		if((posicaoFinalColunaXC < 0) || (posicaoFinalColunaXC >= tabu.getTabuleiro().length)){
			throw new TamanhoInvalido("Posição da coluna inválida");
		}if( (posicaoFinalLinhaYL < 0 )|| (posicaoFinalLinhaYL >= tabu.getTabuleiro().length)){
			throw new TamanhoInvalido("Posição da linha inválida");
		}
	}
	
}
