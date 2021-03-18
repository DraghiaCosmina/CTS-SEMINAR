package ro.ase.cts.class1;

import ro.ase.cts.classes.ClinicaVeterinaraLazy;

public class ClubDans {

	private String nume;
	private int numarDansatori;
	private float taxaInscriere;

	private static ClubDans instanta = null;

	private ClubDans(String nume, int numarDansatori, float taxaInscriere) {
		super();
		this.nume = nume;
		this.numarDansatori = numarDansatori;
		this.taxaInscriere = taxaInscriere;
	}

	public static synchronized ClubDans getInstance(String nume, int numarDansatori, float taxaInscriere) {
		if (instanta == null) {
			instanta = new ClubDans(nume, numarDansatori, taxaInscriere);
		}
		return instanta;

	}

	@Override
	public String toString() {
		return "ClubDans [nume=" + nume + ", numarDansatori=" + numarDansatori + ", taxaInscriere=" + taxaInscriere
				+ "]";
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNumarDansatori(int numarDansatori) {
		this.numarDansatori = numarDansatori;
	}

	public void setTaxaInscriere(float taxaInscriere) {
		this.taxaInscriere = taxaInscriere;
	}

}
