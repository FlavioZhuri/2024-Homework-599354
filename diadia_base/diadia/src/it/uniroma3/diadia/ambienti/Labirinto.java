package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;

/**
 * Questa classe Labirinto inizializza un Labirinto di Stanze
 * Ogni stanza può avere al piu 4 stanze adiacenti 
 * questa classe si occupa anche di gestire l'inizio del labirinto
 * e il termine (partenza) e (vittoria) 
 * Questa classe si occupa anche di inizializzare gli oggetti Attrezzo nelle
 * varie stanze  
 * @author Flavio Zhuri 599354
 * @version base 1.0
 * @see Attrezzo
 * @see Stanza 
 */
public class Labirinto {

	private Stanza atrio = new Stanza("Atrio");
	private Stanza aulaN11 = new Stanza("Aula N11");
	private Stanza aulaN10 = new Stanza("Aula N10");
	private Stanza laboratorio = new Stanza("Laboratorio Campus");
	private Stanza biblioteca = new Stanza("Biblioteca");

	private Stanza stanzaIniziale;
	private Stanza stanzaFinale;

	public Labirinto(){
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);

		stanzaIniziale = aulaN11;
		stanzaFinale = biblioteca;	

		/* crea gli attrezzi */
		Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);

		/* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);

	}

	
	// getter e setter automatici da Eclipse

	public Stanza getAtrio() {
		return atrio;
	}

	public void setAtrio(Stanza atrio) {
		this.atrio = atrio;
	}

	public Stanza getAulaN11() {
		return aulaN11;
	}

	public void setAulaN11(Stanza aulaN11) {
		this.aulaN11 = aulaN11;
	}

	public Stanza getAulaN10() {
		return aulaN10;
	}

	public void setAulaN10(Stanza aulaN10) {
		this.aulaN10 = aulaN10;
	}

	public Stanza getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Stanza laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Stanza getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Stanza biblioteca) {
		this.biblioteca = biblioteca;
	}

	public Stanza getStanzaIniziale() {
		return stanzaIniziale;
	}

	public void setStanzaIniziale(Stanza stanzaIniziale) {
		this.stanzaIniziale = stanzaIniziale;
	}

	public Stanza getStanzaFinale() {
		return stanzaFinale;
	}

	public void setStanzaFinale(Stanza stanzaFinale) {
		this.stanzaFinale = stanzaFinale;
	}

}
