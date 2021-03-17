package ro.ase.cts.classes;

import java.util.Arrays;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static float sumaFinantare = 10;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	@Override
	public String toString() {
		return "Angajat: " + super.toString() + ocupatie + ", salariu=" + salariu;
	}

	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return sumaFinantare;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

}
