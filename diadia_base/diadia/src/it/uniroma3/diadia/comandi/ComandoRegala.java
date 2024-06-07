package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoRegala extends AbstractComando {
	private IO io;

	@Override
	public void esegui(Partita partita) {
		Attrezzo attrezzo = partita.getPlayer().getBag().getAttrezzo(this.getParametro());
		io.mostraMessaggio(partita.getStanzaCorrente().getPersonaggio().riceviRegalo(attrezzo, partita));
		partita.getPlayer().getBag().removeAttrezzo(this.getParametro());
	}

	@Override
	public void setIO(IO io) {
		this.io = io;
	}

}
