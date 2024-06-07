package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaTest {
	
	Stanza stanza1 = new Stanza("stanza1");
	Stanza stanza2 = new Stanza("stanza2");
	
	Attrezzo attrezzo1 = new Attrezzo("ascia", 9);
	
	@Test
	public void testGetStanzaAdiacente() {
		assertNull(stanza1.getStanzaAdiacente(Direzione.nord));
	}

	@Test
	public void testImpostaStanzaAdiacente() {
		stanza1.impostaStanzaAdiacente(Direzione.nord, stanza2);
		assertEquals(stanza2, stanza1.getStanzaAdiacente(Direzione.nord));
	}
	
	@Test
	public void testAddAttrezzo() {
		assertTrue(stanza1.addAttrezzo(attrezzo1));
	}
	
	@Test
	public void testGetStanzaAdiacenteOvest() {
		assertNull(stanza2.getStanzaAdiacente(Direzione.ovest));
	}	
}