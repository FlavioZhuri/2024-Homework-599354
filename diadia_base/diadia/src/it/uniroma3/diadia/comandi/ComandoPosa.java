package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {
	private IO io;
	private String nomeAttrezzo;
	private final static String NOME = "posa";


	@Override
	public void esegui(Partita partita) {
		
		Attrezzo a = partita.getPlayer().getBag().getAttrezzo(nomeAttrezzo);
		
		if(a == null) {
			io.mostraMessaggio("l'attrezzo non è presente nella borsa");
			return;
		}

		if( partita.getStanzaCorrente().getNumeroAttrezzi() <= 10) {
			partita.getPlayer().getBag().removeAttrezzo(nomeAttrezzo);
			partita.getStanzaCorrente().addAttrezzo(a);
			
			io.mostraMessaggio("L'attrezzo è stato posato nella stanza! ");
		}
		else {
			io.mostraMessaggio("Non c'e' spazio nella stanza per poter inserire questo attrezzo!");
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
