package Manipuladores;

import javax.swing.text.html.MinimalHTMLWriter;

import Validacoes.ValidacaoPedra;
import entidades.Jogo;
import entidades.Tabuleiro;
import entidades.pecas.CasaValida;
import entidades.pecas.Peca;
import excecoes.DamasException;

public class ManipuladorJogo {

	private Tabuleiro tabu;
	private Jogo jogo;
	private ManipuladorXml manipJogo;

	
	public void zerarJogo() {
		manipJogo.removerAllDados();

	}
	
	public ManipuladorJogo() {
		manipJogo = new ManipuladorXml();
	}

	public void criarTabuleiro(String idTabuleiro, int tamanho) throws DamasException {
		
		if(manipJogo.recuperarTabuleiro(idTabuleiro)==null){
			tabu = new Tabuleiro(idTabuleiro, tamanho);
			
			tabu.preecherTabuleiro();
			manipJogo.salvarTabuleiro(tabu);
			
			
		}else{
			throw new DamasException("Id ja existe");
		}

	}

	public void iniciarPartida(String id, String idTabuleiro, String jogador1, String jogador2, int jogadorPedraBranca,
			String regraMovimento, boolean permiteSopro) throws DamasException {
		if(manipJogo.recuperarJogo(id)==null){
			if(manipJogo.recuperarTabuleiro(idTabuleiro)==null){
				throw new DamasException("Tabuleiro Nao existe");
			}
			
			jogo = new Jogo();
			
			jogo.setIdJogo(id);
			jogo.setIdTabuleiro(idTabuleiro);
			jogo.setJogador1(jogador1);
			jogo.setJogador2(jogador2);
			jogo.setJogadorPedraBranca(jogadorPedraBranca);
			jogo.setIdRegraMovimento(regraMovimento);
			jogo.setIdRegraSopro(regraMovimento);
			
		}
		throw new DamasException("Jogo Ja existe - Igor");

	}

	public void ativarPosicionamentoManual(String idPartida) {

	}

	public void posicionarPeca(String idPartida, int cor, int linha, String coluna) throws DamasException {

	}

	public void movimentoJogador(int numeroJogador, int linhaOrigem, String colunaOrigem, int linhaDestino,
			String colunaDestino) throws DamasException {

	}

	public String getVencedorPartida(String id) throws DamasException {
		return null;
	}

	public boolean isOcupada(String idPartida, int linha, String coluna) throws DamasException {
		try {
			Peca a = tabu.localizar(linha, coluna);
			if (a.getClass() != CasaValida.class) {
				return false;
			} else
				return true;
			
		} catch (Exception e) {
			throw new DamasException(e.getMessage());
		}
	}

	public String getCorCasa(String idTabuleiro, int linha, String coluna) throws DamasException {
		manipJogo.recuperarTabuleiro(idTabuleiro);
		
		ValidacaoPedra.verificarParametros(idTabuleiro);
		return tabu.localizar(linha, coluna).getCor();
	}

	public String getCorPeca(String idPartida, int linha, String coluna) throws DamasException {
		return null;
	}

	public void encerrarPartidaSemSalvar(String idPartida) throws DamasException {

	}

	public void descartarPartida(String idPartida) throws DamasException {

	}

	public void finalizarESalvarJogo(String idPartida) throws DamasException {

	}

	public void continuarPartida(String idPartida) throws DamasException {

	}

	public boolean isDama(String idPartida, int linha, String coluna) throws DamasException {
		return false;
	}

	public void setVez(String idPartida, int numeroJogador) throws DamasException {

	}

}
