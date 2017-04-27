package entidades;

import excecoes.TamanhoInvalido;

public class Tabuleiro {
	
	private int vetorLinha[];
	private int vetorColuna[];
	
	public Tabuleiro(int tamanhoVetor )throws TamanhoInvalido{ 
		if ((tamanhoVetor > 5)&&(tamanhoVetor % 2 == 0)){
			this.vetorLinha = new int[tamanhoVetor];
			this.vetorColuna = new int[tamanhoVetor -1 ];
		}
		throw new TamanhoInvalido("Tamanho invalido para o tabuleiro");
	}

	public int[] getVetorLinha() {
		return vetorLinha;
	}

	public void setVetorLinha(int[] vetorLinha) {
		this.vetorLinha = vetorLinha;
	}

	public int[] getVetorColuna() {
		return vetorColuna;
	}

	public void setVetorColuna(int[] vetorColuna) {
		this.vetorColuna = vetorColuna;
	}
	

}
