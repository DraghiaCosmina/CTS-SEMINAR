package ro.ase.cts.facade.classes;

public class Pacient {
	private boolean esteInStareGrava;
	private String numePacient;

	public Pacient(boolean esteInStareGrava, String numePacient) {
		super();
		this.esteInStareGrava = esteInStareGrava;
		this.numePacient = numePacient;
	}

	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}

	public String getNumePacient() {
		return numePacient;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
