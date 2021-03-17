package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afiseazaStatus(Proiect proiect) {
		System.out.println("Aplicantul " + nume + " " + prenume);
		if (punctaj > proiect.getPragAdmitere()) {
			System.out.println("a fost acceptat.");
		} else {
			System.out.println("nu a fost acceptat.");
		}
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumireProiect;
	}

	public void setNrProiecte(int nrProiecte, String[] vect) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = vect;

	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nrProiecte=" + nrProiecte + ", denumiriProiect=" + Arrays.toString(denumiriProiecte) + "]";
	}

}
