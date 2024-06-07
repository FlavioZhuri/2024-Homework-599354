package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi extends AbstractComando {

	private final static String NOME = "prendi";

	
	@Override
	public void esegui(Partita partita) {
		Attrezzo a = partita.getLab().getStanzaCorrente().getAttrezzo(this.getParametro());
		if(a==null) {
			this.getIo().mostraMessaggio("Attrezzo non presente nella stanza!");
		} 
		else {
			if(partita.getPlayer().getBag().getPesoRimanente(a)) {
				partita.getPlayer().getBag().addAttrezzo(a);
				partita.getLab().getStanzaCorrente().removeAttrezzo(a);
			} 
			else
				this.getIo().mostraMessaggio("Attrezzo troppo pesante per entrare nella borsa!");
			}
	}

	@Override
	public String getNome() {
		return NOME;
	}

}
