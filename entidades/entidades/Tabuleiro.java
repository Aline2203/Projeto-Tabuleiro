package entidades;


import entidades.pecas.CasaBloqueada;
import entidades.pecas.CasaValida;
import entidades.pecas.FabricaPecas;
import entidades.pecas.Peca;
import excecoes.DamasException;

public class Tabuleiro {


	private Peca[][] tabu;

	private String id;
	
	public Tabuleiro(String id,int tamanhoVetor) throws DamasException {
		if (tamanhoVetor % 2 == 0 && tamanhoVetor > 5) {
			tabu = new Peca[tamanhoVetor][tamanhoVetor];
			this.id=id;
			configurarTabuleiro();
		} else {
			throw new DamasException("Tamanho de tabuleiro invalido");
		}
	}
	
	public String getId(){ 
		return id;
	}
	
	public Tabuleiro() {
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
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "escura");
						} else {

							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "escura");
						}

					}

				} else {
					for (int j = 0; j < tabu[i].length; j++) {
						if (j % 2 == 0) {
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "escura");
						} else {
							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "escura");
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
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "branca");
						} else {
							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "branca");
						}

					}

				} else {
					for (int j = 0; j < tabu[i].length; j++) {
						if (j % 2 == 0) {
							tabu[i][j] = FabricaPecas.criarPeca("Pedra", "branca");
						} else {
							tabu[i][j] = FabricaPecas.criarPeca("CasaBloqueada", "branca");
						}
					}
				}

			}
		}
	}

	public void mudarPosicao(int posicaoColuna, char posicaoLinha, int posicaoFinalColuna, char posicaoFinalLinha) {
		Peca peca = tabu[posicaoColuna][posicaoLinha];
		tabu[posicaoColuna][posicaoLinha] = FabricaPecas.criarPeca("", "");
		tabu[posicaoFinalColuna][posicaoFinalLinha] = peca;

	}
	
	private int acharLetraCluna(String letra){
		try {
			int a = letra.charAt(0);
			int cont = 0;
			for(int i = 0;96+i<a-1;i++){
				cont++;
			}
			
			
			
//			risso 99665-2385
			
//			System.out.println("Letra Passada = "+letra+"|||| numero da letra = "+cont);
			return cont;
			
		} catch (Exception e) {
//			System.out.println("Erro Na converção - -" + e.getMessage());
			return 0;
		}
	}

	public Peca localizar(int posicaoLinha,String posicaoColuna){
		return tabu[acharLetraCluna(posicaoColuna)][posicaoLinha-1];
	}

}
