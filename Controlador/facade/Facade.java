package facade;

import Manipuladores.ManipuladorJogo;
import Regras.RegraMovimento;
import Regras.RegraSopro;
import excecoes.DamasException;

public class Facade implements IFacadeJogoDamas {

	private ManipuladorJogo jogo;
	private RegraMovimento regraMovimento = new RegraMovimento();
	private RegraSopro regraSopro = new RegraSopro();
	
	public Facade() {
		jogo = new ManipuladorJogo();
	}

	//	nao tem nada haver com a fachada mas os casso de teste pedem
	public  void regraMovimento(String idRegraMovimento,boolean comerVoltando) {
		regraMovimento.setId(idRegraMovimento);
		regraMovimento.setComerVoltando(comerVoltando);
		
	}
	
	public void regraSopro(String idRegraSopro,boolean permitirSopro){
		regraSopro.setId(idRegraSopro);
		regraSopro.setPremitirSopro(permitirSopro);
		
	}
	
	

	public void zerarJogo() {
		jogo.zerarJogo();

	}

	public void criarTabuleiro(String idTabuleiro, int tamanho) throws DamasException {
		try {
			jogo.criarTabuleiro(idTabuleiro, tamanho);
		} catch (DamasException e) {
			throw new DamasException(e.getMessage());
		}
	}

	public void iniciarPartida(String id, String idTabuleiro, String jogador1, String jogador2, int jogadorPedraBranca,
			String regraMovimento, boolean permiteSopro) throws DamasException {
		try {
			jogo.iniciarPartida(id, idTabuleiro, jogador1, jogador2, jogadorPedraBranca, regraMovimento, permiteSopro);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			throw new DamasException(e.getMessage());
		}
	}

	@Override
	public void ativarPosicionamentoManual(String idPartida) {
		jogo.ativarPosicionamentoManual(idPartida);

	}

	@Override
	public void posicionarPeca(String idPartida, int cor, int linha, String coluna) throws DamasException {
		try {
			jogo.posicionarPeca(idPartida, cor, linha, coluna);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			throw new DamasException(e.getMessage());
		}
	}

	@Override
	public void movimentoJogador(int numeroJogador, int linhaOrigem, String colunaOrigem, int linhaDestino,
			String colunaDestino) throws DamasException {
		try {
			jogo.movimentoJogador(numeroJogador, linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			throw new DamasException(e.getMessage());
		}
	}

	@Override
	public String getVencedorPartida(String id) throws DamasException {
		try {
			return jogo.getVencedorPartida(id);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			throw new DamasException(e.getMessage());
		}
	}

	@Override
	public boolean isOcupada(String idPartida, int linha, String coluna) throws DamasException {
		try {
			return jogo.isOcupada(idPartida, linha, coluna);
		} catch (DamasException e) {
			
			throw new DamasException(e.getMessage());
		}
	}

	@Override
	public String getCorCasa(String idTabuleiro, int linha, String coluna) throws DamasException {
		try {
			return jogo.getCorCasa(idTabuleiro, linha, coluna);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			throw new DamasException(e.getMessage());
		}
	}

	@Override
	public String getCorPeca(String idPartida, int linha, String coluna) throws DamasException {
		try {
			return jogo.getCorPeca(idPartida, linha, coluna);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			return "";
		}
	}

	@Override
	public void encerrarPartidaSemSalvar(String idPartida) throws DamasException {
		try {
			jogo.encerrarPartidaSemSalvar(idPartida);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void descartarPartida(String idPartida) throws DamasException {
		try {
			jogo.descartarPartida(idPartida);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void finalizarESalvarJogo(String idPartida) throws DamasException {
		try {
			jogo.finalizarESalvarJogo(idPartida);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void continuarPartida(String idPartida) throws DamasException {
		try {
			jogo.continuarPartida(idPartida);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public boolean isDama(String idPartida, int linha, String coluna) throws DamasException {
		try {
			return jogo.isDama(idPartida, linha, coluna);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public void setVez(String idPartida, int numeroJogador) throws DamasException {
		try {
			jogo.setVez(idPartida, numeroJogador);
		} catch (DamasException e) {
			System.out.println(e.getMessage());
		}

	}

}
