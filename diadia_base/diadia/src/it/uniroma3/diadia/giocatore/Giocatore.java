package it.uniroma3.diadia.giocatore;

/**
 * Questa classe modella un Giocatore attribuendo i CFU Iniziali
 * una Oggetto Borsa e contiene i vari getter e setter necessari per la  
 * borsa
 * @author Flavio Zhuri 599354
 * @version base 1.0
 * @see Borsa
 */
public class Giocatore {

	static final private int CFU_INIZIALI = 20;

	private int cfu;
	
	private Borsa bag;

	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.bag = new Borsa();
	}

	
	public Borsa getBag() {
		return bag;
	}

	public void setBag(Borsa bag) {
		this.bag = bag;
	}

	public static int getCfuIniziali() {
		return CFU_INIZIALI;
	}

	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
	
}
