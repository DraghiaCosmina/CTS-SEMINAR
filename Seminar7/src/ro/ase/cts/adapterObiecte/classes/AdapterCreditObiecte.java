package ro.ase.cts.adapterObiecte.classes;

public class AdapterCreditObiecte implements InterfataCredit{
	private Leasing leasing;

	public AdapterCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		this.leasing.oferaLeasing(numeClient, suma);
		
	}
	
	
	

}
