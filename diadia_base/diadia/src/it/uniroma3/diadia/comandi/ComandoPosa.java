package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa extends AbstractComando{

	private final static String NOME = "posa";


	@Override
	public void esegui(Partita partita) {
		Attrezzo a = partita.getPlayer().getBag().getAttrezzo(this.getParametro());
		if(a==null) {
			this.getIo().mostraMessaggio("Attrezzo non presente nella borsa!");
			return;
		}
		if(partita.getStanzaCorrente().getNumeroAttrezziPossibili()>0) {
			partita.getLab().getStanzaCorrente().addAttrezzo(a);
			partita.getPlayer().getBag().removeAttrezzo(this.getParametro());
		}
		else {
			this.getIo().mostraMessaggio("Non c'e' spazio nella stanza per poter inserire questo attrezzo!");
		}
	}

	@Override
	public String getNome() {
		return NOME;

	}
}
