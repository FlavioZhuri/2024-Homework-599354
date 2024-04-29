package it.uniroma3.diadia.giocatore;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;

	public Borsa() {
		this.pesoMax = DEFAULT_PESO_MAX_BORSA;
		this.attrezzi = new Attrezzo[10]; // speriamo bastino...
		this.numeroAttrezzi = 0;
	}
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		if (this.numeroAttrezzi==10)
			return false;
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return true;
	}
	public int getPesoMax() {
		return pesoMax;
	}
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if(this.attrezzi[i] != null)
				if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
					a = attrezzi[i];

		return a;

	}

	public int getPeso() {
		int peso = 0;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if(this.attrezzi[i]!=null)

				peso += this.attrezzi[i].getPeso();

		return peso;
	}
	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		
		//continua l'ho utilizzato per gestire il caso in cui devo eliminare 
		//un solo oggetto che hao lo stesso nome da stringa di un altro perchè
		//altrimenti li rimuove entrambi
		boolean continua = true;

		if(this.hasAttrezzo(nomeAttrezzo) ) {
			a = this.getAttrezzo(nomeAttrezzo);
		}

		for(int i = 0; i<this.attrezzi.length && continua; i++) {

			if(this.attrezzi[i] != null) {

				if(this.attrezzi[i].equals(a)) {
					attrezzi[i] = null;
					continua = false;
				}
			}
		}

		return a;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();

		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i= 0; i<this.numeroAttrezzi; i++)
				if(this.attrezzi[i]!=null)
					s.append(attrezzi[i].toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
}
