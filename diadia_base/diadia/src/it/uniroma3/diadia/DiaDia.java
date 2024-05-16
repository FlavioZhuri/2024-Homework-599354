package it.uniroma3.diadia;


import it.uniroma3.diadia.ambienti.Direzione;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.LabirintoBuilder;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;

/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il letodo gioca
 *
 * Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  docente di POO + Flavio Zhuri 599354
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *          
 * @version base
 */

public class DiaDia {

	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";

	private Partita partita;
	private IO io;

	public DiaDia(Labirinto labirinto) {
		this.io = IOConsole.getInstance();
		this.partita = new Partita(labirinto);
	}
	
	
	
	public DiaDia(IO io, Labirinto labirinto) {
		this.io = IOConsole.getInstance();
		this.partita = new Partita(labirinto);
	}
	

	public void gioca() {
		String istruzione; 

		//System.out.println(MESSAGGIO_BENVENUTO);
		io.mostraMessaggio(MESSAGGIO_BENVENUTO);

		do		
			istruzione = io.leggiRiga();
		while (!processaIstruzione(istruzione) );
	}   
	
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire;
		FabbricaDiComandiFisarmonica factory = new FabbricaDiComandiFisarmonica(this.io);
		comandoDaEseguire = factory.costruisciComando(istruzione);
		comandoDaEseguire.esegui(this.partita);
		if (this.partita.vinta())
		io.mostraMessaggio("Hai vinto!");
		if (this.partita.getPlayer().getCfu() <= 0 )
			io.mostraMessaggio("Hai finito i CFU ");
		return this.partita.isFinita();
		}


	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */


	/*



	private boolean processaIstruzione(String istruzione, IOConsole console) {
		Comando comandoDaEseguire;

		if(comandoDaEseguire.getNome() == null) {
			console.mostraMessaggio(MESSAGGIO_BENVENUTO);
			return false;
		}
		else if (comandoDaEseguire.getNome().equals("fine")) {
			this.fine(console); 
			return true;
		} else if (comandoDaEseguire.getNome().equals("vai"))
			this.vai(comandoDaEseguire.getParametro(), console);
		else if (comandoDaEseguire.getNome().equals("aiuto"))
			this.aiuto(console);
		else if (comandoDaEseguire.getNome().equals("prendi"))
			this.prendi(comandoDaEseguire.getParametro(), console);
		else if (comandoDaEseguire.getNome().equals("posa"))
			this.posa(comandoDaEseguire.getParametro(), console);
		else if (comandoDaEseguire.getNome().equals(null))
			console.mostraMessaggio("inserisci un comando !");
		else
			console.mostraMessaggio("Comando sconosciuto");
		if (this.partita.vinta()) {
			console.mostraMessaggio("Hai vinto!");
			return true;
		} else
			return false;
	}   



	 */

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */


	/*

	private void aiuto(IOConsole console) {
		for(int i=0; i< elencoComandi.length; i++) 
			// ora il tipo di stampa è diverso perchè prima usavo un print
			console.mostraMessaggio(elencoComandi[i]+" "); 
		console.mostraMessaggio("");
	}


	 */

	/**
	 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
	 * e ne stampa il nome, altrimenti stampa un messaggio di errore
	 */




	/*


	private void vai(String direzione, IOConsole console) {
		while(direzione==null || direzione=="")
		{ 
			console.mostraMessaggio("Dove vuoi andare ?");
			direzione = console.leggiRiga();
		}
		Stanza prossimaStanza = null;
		prossimaStanza = this.partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			console.mostraMessaggio("Direzione inesistente");
		else {
			this.partita.setStanzaCorrente(prossimaStanza);
			int cfu = this.partita.getPlayer().getCfu();
			cfu--;
			this.partita.getPlayer().setCfu(cfu);

		}
		console.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
	}




	 */

	/**
	 * Comando "Fine".
	 * @param console 
	 */




	/*	

	private void fine(IOConsole console) {
		console.mostraMessaggio("Grazie di aver giocato!");  // si desidera smettere
	}


	 */	

	/** 
	 * Comando per Prendere un attrezzo : passi una stringa che contiene il nome dell attrezzo
	 * @param string nomeAttrezzo
	 */



	/*	


	public void prendi(String nomeAttrezzo, IOConsole console){
		// creo questa variabile per rappresentare l'oggetto attrezzo 
		// della partita nella stanza corrente che sto cercando può essere null
		Attrezzo a = this.partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);

		if( a == null) {
			console.mostraMessaggio("L'attrezzo non è presente nella stanza...");
			return;
		}	

		if(this.partita.getPlayer().getBag().getPeso() + a.getPeso() > 10)
		{
			console.mostraMessaggio("L'attrezzo non entra nella brrsa...");
			return;
		}

		this.partita.getStanzaCorrente().removeAttrezzo(a, console);
		this.partita.getPlayer().getBag().addAttrezzo(a);

		console.mostraMessaggio("L'attrezzo è stato preso e messo nella borsa");

		console.mostraMessaggio(this.partita.getPlayer().getBag().toString());

	}



	 */	




	/*	

	public void posa(String nomeAttrezzo, IOConsole console){
		Attrezzo a = this.partita.getPlayer().getBag().getAttrezzo(nomeAttrezzo);

		if( a == null) {
			console.mostraMessaggio("L'attrezzo non è presente nella borsa...");
			return;
		}

		if(this.partita.getStanzaCorrente().getNumeroAttrezzi() >= 10) {
			console.mostraMessaggio("La stanza ha troppi attrezzi non puoi posarne altri...");
			return;
		}

		this.partita.getPlayer().getBag().removeAttrezzo(nomeAttrezzo);
		this.partita.getStanzaCorrente().addAttrezzo(a);

		console.mostraMessaggio("L'attrezzo è stato posato nella stanza");

		console.mostraMessaggio(this.partita.getPlayer().getBag().toString());
	}



	 */


	public static void main(String[] argc) {
		Labirinto labirinto = new LabirintoBuilder()
										.addStanzaIniziale("Atrio")
										.addAttrezzo("martello", 3)
										.addStanzaVincente("Biblioteca")
										.addAdiacenza("Atrio", "Biblioteca", Direzione.NORD)
										.getLabirinto();
		DiaDia gioco = new DiaDia(labirinto);
		gioco.gioca();
	}
}