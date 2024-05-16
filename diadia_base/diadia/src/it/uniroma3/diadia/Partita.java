package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO + Flavio Zhuri 599354
 * @see Stanza
 * @version base
 */

public class Partita {

	private boolean finita;
	private Labirinto lab;
	private Giocatore player;
	
	public Partita(Labirinto labirinto){
		this.lab = labirinto;
		this.player = new Giocatore();
		//labirinto.creaStanze();
		this.finita = false;
	}

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return lab.getStanzaCorrente() == lab.getStanzaFinale();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (player.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	public Labirinto getLab() {
		return lab;
	}

	public void setLab(Labirinto lab) {
		this.lab = lab;
	}

	public Giocatore getPlayer() {
		return player;
	}

	public void setPlayer(Giocatore player) {
		this.player = player;
	}
	
	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.getLab().setStanzaCorrente(stanzaCorrente);
	}

	public Stanza getStanzaCorrente() {
		return this.getLab().getStanzaCorrente();
	}
	

}
