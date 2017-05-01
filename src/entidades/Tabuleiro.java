package entidades;

import entidades.pecas.CasaBloqueada;
import entidades.pecas.CasaValida;
import entidades.pecas.Peca;
import excecoes.TamanhoInvalido;

public class Tabuleiro {

	private Peca[][] tabu;

	public Tabuleiro(int tamanhoVetor) throws TamanhoInvalido {
		if (tamanhoVetor % 2 == 0 && tamanhoVetor > 5) {
			tabu = new Peca[tamanhoVetor][tamanhoVetor];
			configurarTabuleiro();
			imprimirTabuleiro();
		} else {
			System.out.println("Numero Invalido");
		}
	}

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
						tabu[i][j] = new CasaValida();
					} else {
						tabu[i][j] = new CasaBloqueada();
					}

				}

			} else {
				for (int j = 0; j < tabu[i].length; j++) {
					if (j % 2 == 0) {
						tabu[i][j] = new CasaValida();
					} else {
						tabu[i][j] = new CasaBloqueada();
					}
				}
			}

		}
	}

	public Peca[][] getTabuleiro() {
		return tabu;
	}

	public static void main(String[] args) {
		try {
			new Tabuleiro(12);
		} catch (TamanhoInvalido e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
