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
	
	
/*
	private Stanza atrio = new Stanza("Atrio");
	private Stanza aulaN11 = new Stanza("Aula N11");
	private Stanza aulaN10 = new Stanza("Aula N10");
	private Stanza laboratorio = new Stanza("Laboratorio Campus");
	private Stanza biblioteca = new Stanza("Biblioteca");
*/
	private Stanza stanzaCorrente;
	private Stanza stanzaFinale;
/*
	public Labirinto(){
		atrio.impostaStanzaAdiacente(Direzione.NORD, biblioteca);
		atrio.impostaStanzaAdiacente(Direzione.EST, aulaN11);
		atrio.impostaStanzaAdiacente(Direzione.SUD, aulaN10);
		atrio.impostaStanzaAdiacente(Direzione.OVEST, laboratorio);
		aulaN11.impostaStanzaAdiacente(Direzione.EST, laboratorio);
		aulaN11.impostaStanzaAdiacente(Direzione.OVEST, atrio);
		aulaN10.impostaStanzaAdiacente(Direzione.NORD, atrio);
		aulaN10.impostaStanzaAdiacente(Direzione.EST, aulaN11);
		aulaN10.impostaStanzaAdiacente(Direzione.OVEST, laboratorio);
		laboratorio.impostaStanzaAdiacente(Direzione.EST, atrio);
		laboratorio.impostaStanzaAdiacente(Direzione.OVEST, aulaN11);
		biblioteca.impostaStanzaAdiacente(Direzione.SUD, atrio);

		stanzaIniziale = aulaN11;
		stanzaFinale = biblioteca;	

		// crea gli attrezzi 
		Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);

		// pone gli attrezzi nelle stanze 
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);

	}
	
	*/

	public Stanza getStanzaFinale() {
		return stanzaFinale;
	}
	
	public void setStanzaFinale(Stanza stanzaFinale) {
		this.stanzaFinale = stanzaFinale;
	}
	
	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}
	
	public static LabirintoBuilder newBuilder() {
		return new LabirintoBuilder();
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	
	
	
}
