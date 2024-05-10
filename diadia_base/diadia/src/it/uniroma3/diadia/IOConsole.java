package it.uniroma3.diadia;
import java.util.Scanner;
public class IOConsole implements IO{

	private static IOConsole instance;

	private IOConsole(){}

	public static IOConsole getInstance(){
		if(instance == null)
			instance = new IOConsole();
		return instance;
	}

	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}
	public String leggiRiga() {
		Scanner scannerDiLinee = new Scanner(System.in);
		String riga = scannerDiLinee.nextLine();
		    scannerDiLinee.close();
		return riga;
	}
}