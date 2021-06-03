package ro.ase.cts.test.claseDubluri;

import java.util.List;

import ro.ase.cts.classes.IStudent;

public class StudentFake implements IStudent {
	private boolean areRestante;
	private String numeStudent;
	private float medie;
	
	

	public StudentFake(boolean areRestante, String numeStudent, float medie) {
		super();
		this.areRestante = areRestante;
		this.numeStudent = numeStudent;
		this.medie = medie;
	}
	

	public StudentFake() {
		super();
	}


	public boolean isAreRestante() {
		return areRestante;
	}

	public void setAreRestante(boolean areRestante) {
		this.areRestante = areRestante;
	}

	public String getNumeStudent() {
		return numeStudent;
	}

	public void setNumeStudent(String numeStudent) {
		this.numeStudent = numeStudent;
	}

	public float getMedie() {
		return medie;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return numeStudent;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestante;
	}

}
