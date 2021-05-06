package ro.ase.cts.command.classes;

public class ContBancar {

	private String detinator;
	private float suma;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.suma=0;
	}

	public void constituire(float sumaConstituire) {
		System.out.println("Contul a fost contituit ");
		this.suma = sumaConstituire;
	}

	public void retragere(float sumaRetrasa) {
		if (this.suma >= sumaRetrasa) {
			System.out.println("S-a efectuat o retragere");
			this.suma -= sumaRetrasa;
		} else {
			System.out.println("Nu dispuneti de fonduri suficiente");
		}
	}

	public void depunere(float sumaDepusa) {
		this.suma += sumaDepusa;
		System.out.println("S-a depus suma");
	}
}
