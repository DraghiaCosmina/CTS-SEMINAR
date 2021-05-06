package ro.ase.cts.ChainOfResponsability.classes;

public class ContCurent extends Cont {

	public ContCurent(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);

	}

	@Override
	public void plateste(float suma) {
		if (super.getSold() >= suma) {
			System.out.println(super.getNumeClient() + " a realizat plata de: " + suma + " dim contul curent");
		} else {
			super.getSuccesor().plateste(suma);
		}

	}

}
