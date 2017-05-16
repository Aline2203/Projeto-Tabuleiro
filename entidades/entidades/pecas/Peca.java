package entidades.pecas;

public abstract class Peca {
	
	private String cor = "";
	
//	posiçãoXC - a posição da Coluna  
	private int posiçãoXC = 0;

//	posiçãoYL - a posição da linha
	private int posiçãoYL = 0;
	
	public Peca(String cor){
		setCor(cor);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPosiçãoXC() {
		return posiçãoXC;
	}

	public void setPosiçãoXC(int posiçãoXC) {
		this.posiçãoXC = posiçãoXC;
	}

	public int getPosiçãoYL() {
		return posiçãoYL;
	}

	public void setPosiçãoYL(int posiçãoYL) {
		this.posiçãoYL = posiçãoYL;
	}
	
	
	
	
	
	

}
