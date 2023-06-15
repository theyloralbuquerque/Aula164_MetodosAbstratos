package entities;

import entities.enums.Cor;

public abstract class Forma { // Classe abstrata.
	
	private Cor cor;
	
	public Forma() {
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract Double area(); // M�todo abstrato.
}
