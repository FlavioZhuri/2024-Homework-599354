package it.uniroma3.diadia.giocatore;
import java.util.HashSet;
import java.util.Set;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Set<Attrezzo> attrezzi;
	private int pesoMax;

	public Borsa() {
		this.pesoMax = DEFAULT_PESO_MAX_BORSA;
		this.attrezzi = new HashSet<>(); 
	}

	/**
	 * 
	 * @param attrezzo
	 * @return false se l'attrezzo è troppo pesante oppure abbiamo un duplicato
	 */
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;

		return this.attrezzi.add(attrezzo);
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public Attrezzo getAttrezzo(String nomeAttrezzo) {

		for ( Attrezzo attrezzo : this.attrezzi ) {
			if(attrezzo.getNome().equals(nomeAttrezzo))
				return attrezzo;
		}
		return null;
	}


	public int getPeso() {
		int peso = 0;
		for ( Attrezzo attrezzo : this.attrezzi ) {
			peso += attrezzo.getPeso();
		}
		return peso;
	}
	
	
	public boolean isEmpty() {
		return this.attrezzi.size() == 0;
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	
	
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {	
		Attrezzo a = this.getAttrezzo(nomeAttrezzo);
		this.attrezzi.remove(a);
		
		return a;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();

		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for(Attrezzo attrezzo : this.attrezzi) {
				s.append(attrezzo.toString()+" ");
			}
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
}
