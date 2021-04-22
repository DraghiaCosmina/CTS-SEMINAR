package ro.ase.cts.strategy.classes;

public class Client {

	private ModPlata modPlata;
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new Cash();
	}

	public Client(ModPlata modPlata, String nume) {
		super();
		this.modPlata = modPlata;
		this.nume = nume;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public void platesteNota(double suma) {
		System.out.println(nume + " trebuie sa realizeze plata ");
		modPlata.plateste(suma);
	}

}
