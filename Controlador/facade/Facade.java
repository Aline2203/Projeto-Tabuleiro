package facade;

import excecoes.DamasException;

public class Facade implements IFacadeJogoDamas{

	@Override
	public void zerarJogo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void criarTabuleiro(String idTabuleiro, int tamanho) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarPartida(String id, String idTabuleiro, String jogador1, String jogador2, int jogadorPedraBranca,
			String regraMovimento, boolean permiteSopro) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarPosicionamentoManual(String idPartida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void posicionarPeca(String idPartida, int cor, int linha, String coluna) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movimentoJogador(int numeroJogador, int linhaOrigem, String colunaOrigem, int linhaDestino,
			String colunaDestino) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVencedorPartida(String id) throws DamasException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOcupada(String idPartida, int linha, String coluna) throws DamasException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCorCasa(String idTabuleiro, int linha, String coluna) throws DamasException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCorPeca(String idPartida, int linha, String coluna) throws DamasException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void encerrarPartidaSemSalvar(String idPartida) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descartarPartida(String idPartida) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizarESalvarJogo(String idPartida) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void continuarPartida(String idPartida) throws DamasException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDama(String idPartida, int linha, String coluna) throws DamasException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVez(String idPartida, int numeroJogador) throws DamasException {
		// TODO Auto-generated method stub
		
	}

}
