package ro.ase.cts.main;

import ro.ase.cts.class1.ClubDans;
import ro.ase.cts.classes.ClinicaVeterinara;
import ro.ase.cts.classes.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {

//		ClinicaVeterinara clinicaVeterinara1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinicaVeterinara2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinicaVeterinara1.toString());
//		System.out.println(clinicaVeterinara2.toString());

		ClinicaVeterinaraLazy clinicaVeterinaraLazy1 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Str. Independetei",
				4, 5000.45f);
		ClinicaVeterinaraLazy clinicaVeterinaraLazy2 = ClinicaVeterinaraLazy.getInstance("VetClin", "Str. Libertatii",
				5, 4000.45f);

		System.out.println(clinicaVeterinaraLazy1.toString());
		System.out.println(clinicaVeterinaraLazy2.toString());

		clinicaVeterinaraLazy1.setNume("Clinica Vet 1");
		clinicaVeterinaraLazy2.setNrDoctori(45);

		System.out.println(clinicaVeterinaraLazy1.toString());
		System.out.println(clinicaVeterinaraLazy2.toString());
		
		
		ClubDans clubDans1 = ClubDans.getInstance("ClubDans", 10, 100.0f);
		ClubDans clubDans2 = ClubDans.getInstance("DansClub", 15, 150.0f);
		
		System.out.println(clubDans1.toString());
		System.out.println(clubDans2.toString());
		
		clubDans1.setNume("Dans");
		clubDans2.setNumarDansatori(20);
		
		System.out.println(clubDans1.toString());
		System.out.println(clubDans2.toString());

	}

}
