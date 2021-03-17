package ro.ase.cts.classes;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;

	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: " + super.toString() + clasa + ", Tutore=" + tutore;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public float getSumaFinantata() {

		return sumaFinantare;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

}
