package ro.ase.cts.adapterObiecte.main;

import ro.ase.cts.adapterObiecte.classes.AdapterCreditObiecte;
import ro.ase.cts.adapterObiecte.classes.InterfataCredit;
import ro.ase.cts.adapterObiecte.classes.Leasing;

public class Program {
	
	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
		Leasing leasing = new Leasing();
		AdapterCreditObiecte adapter = new AdapterCreditObiecte(leasing);
		oferaInfoCredit(adapter, "Ionel", 245.50f);
		
		
	}

}
