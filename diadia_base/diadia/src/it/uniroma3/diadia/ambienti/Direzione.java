package it.uniroma3.diadia.ambienti;

public enum Direzione {
	NORD, OVEST, SUD, EST, SUDOVEST, NORDEST, SUDEST, NORDOVEST;
	
	/**
	 * 
	 * @param direzione in stringa da convertire
	 * @return null se la direzione non esiste, altrimenti una delle direzione nella ENUM Direzione
	 */
	public static Direzione fromString(String s) {
		
		if(s == null) {
			return null;
		}
		
		if(s.equalsIgnoreCase("NORD"))return Direzione.NORD;
		if(s.equalsIgnoreCase("SUD"))return Direzione.SUD;
		if(s.equalsIgnoreCase("EST"))return Direzione.EST;
		if(s.equalsIgnoreCase("OVEST"))return Direzione.OVEST;
		if(s.equalsIgnoreCase("SUDOVEST"))return Direzione.SUDOVEST;
		if(s.equalsIgnoreCase("NORDEST"))return Direzione.NORDEST;
		if(s.equalsIgnoreCase("SUDEST"))return Direzione.SUDEST;
		if(s.equalsIgnoreCase("NORDOVEST"))return Direzione.NORDOVEST;
		
		return null;	
		
	}
	
	

	
}
