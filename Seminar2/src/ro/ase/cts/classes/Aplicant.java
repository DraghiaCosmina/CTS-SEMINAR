package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiect;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
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

	public int getPunctaj() {
		return punctaj;
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
		this.denumiriProiect = denumireProiect;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nrProiecte, String[] vect) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiect = vect;

	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nrProiecte=" + nrProiecte + ", denumiriProiect=" + Arrays.toString(denumiriProiect) + "]";
	}
	
	
	

}
