package it.uniroma3.diadia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Direzione;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.LabirintoBuilder;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {
	
	Labirinto labirinto;
	
	Partita partita;
	Stanza stanza1 = new Stanza("Stanza1");
	Stanza s;
	Stanza stanza2 = new Stanza("Stanza2"); 
	
	
	@Before
	public void setUp() {
		 labirinto = new LabirintoBuilder()
				.addStanzaIniziale("Atrio")
				.addAttrezzo("martello", 3)
				.addStanzaVincente("Biblioteca")
				.addAdiacenza("Atrio", "Biblioteca", Direzione.NORD)
				.getLabirinto();
		 partita = new Partita(labirinto);
		 s = new Stanza("Stanza");
	}
	
	
	
	@Test
	public void testGetStanzaFinale() {
		assertEquals("Biblioteca", partita.getLab().getStanzaFinale().getNome());
	}
	
	@Test
	public void testIsFinita() {
		assertFalse(partita.isFinita());
	}	
	

	@Test
	public void testSetStanzaCorrente() {
		partita.getLab().setStanzaCorrente(s);
		assertEquals(s, partita.getLab().getStanzaCorrente());
	}
	
	
	
	@Test
	public void testImpostaStanzaAdiacente() {
		stanza1.impostaStanzaAdiacente(Direzione.SUD, stanza2);
		assertEquals(stanza2, stanza1.getStanzaAdiacente(Direzione.SUD));
	}
	
}