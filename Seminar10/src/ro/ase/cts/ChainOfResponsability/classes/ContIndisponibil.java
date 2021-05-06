package ro.ase.cts.ChainOfResponsability.classes;

public class ContIndisponibil extends Cont {

	public ContIndisponibil( String numeClient) {
		super(0, numeClient, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		System.out.println("Fonduri insuficiente pentru a retrage suma de " + suma);
		
	}

}
