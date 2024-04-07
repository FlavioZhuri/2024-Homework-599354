package it.uniroma3.diadia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {

	Partita partita = new Partita();
	Stanza stanza1 = new Stanza("Stanza1");
	
	Stanza stanza2 = new Stanza("Stanza2"); 
	
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
		partita.setStanzaCorrente(stanza1);
		assertEquals(stanza1, partita.getStanzaCorrente());
	}
	
	@Test
	public void testImpostaStanzaAdiacente() {
		stanza1.impostaStanzaAdiacente("sud", stanza2);
		assertEquals(stanza2, stanza1.getStanzaAdiacente("sud"));
	}
	
}