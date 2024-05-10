package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBloccataTest {

	private StanzaBloccata sb;
	private Stanza s1;
	private Attrezzo a;
	
	
	// qui creo 2 stanze, una con la direzione ovest bloccata, l'altra no, 
	// Se mi trovo nella stanza bloccata
	// l'unico modo che ho per sbloccare la direzione Ovest è ottenere un
	// piede di porco
	
	@Before
	public void setUp() throws Exception {
		sb = new StanzaBloccata("StanzaBloccata", Direzione.OVEST, "piedediporco");
		s1 = new Stanza("StanzaNonBloccata");
		a = new Attrezzo("piedediporco", 5);
		sb.impostaStanzaAdiacente(Direzione.OVEST, s1);	
	}
	

	@After
	public void tearDown() throws Exception {
	}

	
	// qui vedo se dopo che se provo ad andare ad ovest dalla stanza bloccata
	// che appunto ha la direzione ovest bloccat, allora mi ritornerà
	// la stessa stanza in cui ero prima 
	
	@Test
	public void testGetStanzaAdiacenteDirezioneBloccata() {
		assertEquals(sb, sb.getStanzaAdiacente(Direzione.OVEST));
	}
	
	// qui invece vedo che se all'interno della stanza bloccata (SB) 
	// si trova l'attrezzo a cioè il piede di porco allora quando vado
	// nella stanza adiacente in direzione ovest mi troverò in s1
	// questo vuol dire che l'ho sbloccata 
	
	@Test
	public void testGetStanzaAdiacenteDirezioneSbloccata() {
		sb.addAttrezzo(a);
		assertEquals(s1, sb.getStanzaAdiacente(Direzione.OVEST));
		
	}

	// questo test invece vede se dopo aver sbloccato la stanza la descrizione
	// combacia 
	
	@Test
	public void testGetDescrizioneDirezioneSbloccata() {
		sb.addAttrezzo(a);
		assertEquals(sb.toString(), sb.getDescrizione());
	}
	
	// questo è un controllo per vedere se la descrizione che la stanza bloccata
	// offre è effettivamente quelal giusta e capiamo quale Attrezzo usare
	
	@Test
	public void testGetDescrizioneDirezioneBloccata() {
		String e = "Stanza bloccata nella direzione: ovest"+"\nPrendi il piedediporco e posalo nella stanza";
		assertEquals(e, sb.getDescrizione());	
	}

}
