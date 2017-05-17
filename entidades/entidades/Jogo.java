package entidades;


public class Jogo {

	private String jogador1;
	private String jogador2;

	private String idJogo;
	private String idTabuleiro;

	private int jogadorPedraBranca;

	private String idRegraMovimento, idRegraSopro;

	public Jogo() {
	}
	
	
	public String getIdRegraMovimento() {
		return idRegraMovimento;
	}

	public void setIdRegraMovimento(String idRegraMovimento) {
		this.idRegraMovimento = idRegraMovimento;
	}

	public String getIdRegraSopro() {
		return idRegraSopro;
	}

	public void setIdRegraSopro(String idRegraSopro) {
		this.idRegraSopro = idRegraSopro;
	}


	public int getJogadorPedraBranca() {
		return jogadorPedraBranca;
	}

	public void setJogadorPedraBranca(int jogadorPedraBranca) {
		this.jogadorPedraBranca = jogadorPedraBranca;
	}


	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}

	public String getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(String idJogo) {
		this.idJogo = idJogo;
	}

	public String getIdTabuleiro() {
		return idTabuleiro;
	}

	public void setIdTabuleiro(String idTabuleiro) {
		this.idTabuleiro = idTabuleiro;
	}

}
