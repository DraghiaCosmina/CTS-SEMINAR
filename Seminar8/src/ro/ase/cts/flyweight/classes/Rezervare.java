package ro.ase.cts.flyweight.classes;

public class Rezervare {
	private int nrMasa;
	private int nrPersone;
	private String oraRezervare;

	public Rezervare(int nrMasa, int nrPersone, String oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersone = nrPersone;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPersone=" + nrPersone + ", oraRezervare=" + oraRezervare + "]";
	}

}
