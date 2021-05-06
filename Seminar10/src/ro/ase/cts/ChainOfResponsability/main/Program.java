package ro.ase.cts.ChainOfResponsability.main;

import ro.ase.cts.ChainOfResponsability.classes.Cont;
import ro.ase.cts.ChainOfResponsability.classes.ContCredit;
import ro.ase.cts.ChainOfResponsability.classes.ContCurent;
import ro.ase.cts.ChainOfResponsability.classes.ContEconomii;
import ro.ase.cts.ChainOfResponsability.classes.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1500, "Cosmina", null);
		Cont contEconomii = new ContEconomii(2500, "Cosmina", null);
		Cont contCredit = new ContCredit(3200, "Cosmina", null);
		Cont contIndisponibil = new ContIndisponibil("Cosmina");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		//contCurent.plateste(500);
		//contCurent.plateste(1600);
		//contCurent.plateste(3000);
		contCurent.plateste(3500);

	}

}
