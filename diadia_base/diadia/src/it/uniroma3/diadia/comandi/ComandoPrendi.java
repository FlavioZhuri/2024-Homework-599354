package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando {

	private IO io =new IOConsole();
	private String nomeAttrezzo;
	private final static String NOME = "prendi";

	
	@Override
	public void esegui(Partita partita) {
		
		Attrezzo a = partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		
		if( a == null) {
			return;
		}
		
		// questo è un confronto che vede se l'attuale peso della borsa + quello
		// dell'oggetto da raccogliere sono superiori al peso Max
		
		if(partita.getPlayer().getBag().getPeso() + a.getPeso() < partita.getPlayer().getBag().getPesoMax()) {
			
			partita.getStanzaCorrente().removeAttrezzo(a);
			partita.getPlayer().getBag().addAttrezzo(a);
			
			io.mostraMessaggio("L'attrezzo è stato inserito nella Borsa");
			
		} 
		else {
			io.mostraMessaggio("Attrezzo troppo pesante per entrare nella borsa!");
		}
	}
	

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo  = parametro;

	}

	@Override
	public String getParametro() {
		return this.nomeAttrezzo;
	}

	@Override
	public void setIO(IO io) {
		this.io = io;
	}
	
	@Override
	public String getNome() {
		return NOME;
	}

}
