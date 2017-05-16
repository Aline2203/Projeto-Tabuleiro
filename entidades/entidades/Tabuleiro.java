package entidades;

import entidades.pecas.CasaBloqueada;
import entidades.pecas.CasaValida;
import entidades.pecas.FabricaPecas;
import entidades.pecas.Peca;
import excecoes.DamasException;

public class Tabuleiro {


	private Peca[][] tabu;

	public Tabuleiro(int tamanhoVetor) throws DamasException {
		if (tamanhoVetor % 2 == 0 && tamanhoVetor > 5) {
			tabu = new Peca[tamanhoVetor][tamanhoVetor];
			configurarTabuleiro();
		} else {
			throw new DamasException("Numero Invalido");
		}
	}
//aline
	public void imprimirTabuleiro() {

		char coluna = 'A';
		System.out.print("	");
		for (int i = 0; i < tabu.length; i++) {
			System.out.print("  " + coluna++ + "  ");
		}
		System.out.println("");
		for (int i = 0; i < tabu.length; i++) {
			System.out.print("\n\n   " + i + "	");
			for (int j = 0; j < tabu[i].length; j++) {
				System.out.print("| " + tabu[i][j].getCor() + " |");

			}

		}

	}

	public void configurarTabuleiro() {
		for (int i = 0; i < tabu.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < tabu[i].length; j++) {

					if (j % 2 == 1) {
						tabu[i][j] = new CasaValida("");
					} else {
						tabu[i][j] = new CasaBloqueada("");
					}

				}

			} else {
				for (int j = 0; j < tabu[i].length; j++) {
					if (j % 2 == 0) {
						tabu[i][j] = new CasaValida("");
					} else {
						tabu[i][j] = new CasaBloqueada("");
					}
				}
			}
		}
	}

	public void preecherTabuleiro() {
		preecherTabuleiroPecasBrancas();
		preecherTabuleiroPecasPretas();
	}

	private void preecherTabuleiroPecasPretas() {
		for (int i = 0; i < tabu.length; i++) {
			if (i < (tabu.length / 2) - 1) {
				if (i % 2 == 0) {
					for (int j = 0; j < tabu[i].length; j++) {

						if (j % 2 == 1) {
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "P");
						} else {

							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "P");
						}

					}

				} else {
					for (int j = 0; j < tabu[i].length; j++) {
						if (j % 2 == 0) {
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "P");
						} else {
							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "P");
						}
					}
				}
			}
		}
	}

	private void preecherTabuleiroPecasBrancas() {
		for (int i = 0; i < tabu.length; i++) {
			if (i > tabu.length / 2) {
				if (i % 2 == 0) {
					for (int j = 0; j < tabu[i].length; j++) {

						if (j % 2 == 1) {
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "B");
						} else {
							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "B");
						}

					}

				} else {
					for (int j = 0; j < tabu[i].length; j++) {
						if (j % 2 == 0) {
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "B");
						} else {
							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "B");
						}
					}
				}

			}
		}
	}

	

	public void mudarPosicao(int posicaoColuna, int posicaoLinha, int posicaoFinalColuna, int posicaoFinalLinha) {
		Peca peca = tabu[posicaoColuna][posicaoLinha];
		tabu[posicaoColuna][posicaoLinha] = FabricaPecas.criarPeca("", "");
		tabu[posicaoFinalColuna][posicaoFinalLinha] = peca;

	}

	public Peca localizar(int posicaoColuna, int posicaoLinha) {
		return tabu[posicaoColuna][posicaoLinha];
	}

}
