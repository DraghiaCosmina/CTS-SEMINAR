package ro.ase.cts.facade.main;

import ro.ase.cts.facade.classes.FacadeInternare;
import ro.ase.cts.facade.classes.Pacient;
import ro.ase.cts.facade.classes.Salon;

public class Program {

	public static void main(String[] args) {
		Pacient pacient1 = new Pacient(false, "Dani");
		Pacient pacient2 = new Pacient(true, "Catalin");
		
		System.out.println(FacadeInternare.verificaPacient(pacient1));
		System.out.println(FacadeInternare.verificaPacient(pacient2));

	}

}
