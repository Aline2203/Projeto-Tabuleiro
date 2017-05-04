package entidades.pecas;

public abstract class Peca {
	
	private String cor = "";
	
//	posi��oXC - a posi��o da Coluna  
	private int posi��oXC = 0;

//	posi��oYL - a posi��o da linha
	private int posi��oYL = 0;
	
	public Peca(String cor){
		setCor(cor);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPosi��oXC() {
		return posi��oXC;
	}

	public void setPosi��oXC(int posi��oXC) {
		this.posi��oXC = posi��oXC;
	}

	public int getPosi��oYL() {
		return posi��oYL;
	}

	public void setPosi��oYL(int posi��oYL) {
		this.posi��oYL = posi��oYL;
	}
	
	
	
	
	
	

}
