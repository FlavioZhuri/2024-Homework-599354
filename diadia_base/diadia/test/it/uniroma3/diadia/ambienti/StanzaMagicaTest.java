package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaTest {

	private StanzaMagica s1;
	private Attrezzo p;
	private Attrezzo m;
	private Attrezzo f;
	
	@Before
	public void setUp() throws Exception {
		s1 = new StanzaMagica("s1", 1);
		p = new Attrezzo("pala", 10);
		m = new Attrezzo("martello", 20);
		f = new Attrezzo("falce", 30);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(s1.addAttrezzo(m));

	}


	@Test
	public void testModificaAttrezzo() {
		assertTrue(s1.addAttrezzo(p));
		assertTrue(s1.addAttrezzo(f));
		assertTrue(s1.addAttrezzo(m));
		
		
		

		assertEquals("olletram",s1.getAttrezzo("olletram").getNome());	
		assertEquals(40,s1.getAttrezzo("olletram").getPeso());	

		}
}
