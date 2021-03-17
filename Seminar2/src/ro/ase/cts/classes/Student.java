package ro.ase.cts.classes;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantare = 20;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte,
			String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii;
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
		Student.sumaFinantare = sumaFinantare;
	}

}
