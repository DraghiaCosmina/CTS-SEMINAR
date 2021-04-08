package ro.ase.cts.adapterClase.main;

import ro.ase.cts.adapterClase.classes.AdapterCreditClase;
import ro.ase.cts.adapterClase.classes.InterfataCredit;

public class Program {
	
	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
		AdapterCreditClase adapterCredit = new AdapterCreditClase();
		oferaInfoCredit(adapterCredit,"Gigel", 322.43f);
		
		
	}

}
