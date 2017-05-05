package excecoes;

public class CasaInvalidaExcetion extends Exception {
	/**
	 * para casas invalidadas do tabuleiro 
	 * @param mensagem
	 */
	public CasaInvalidaExcetion(String mensagem) {
		super(mensagem);
	}

}
