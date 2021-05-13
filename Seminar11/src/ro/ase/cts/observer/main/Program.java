package ro.ase.cts.observer.main;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.Sala;

public class Program {

	public static void main(String[] args) {
		ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
		ClientAbonat clientAbonat2 = new ClientAbonat("Vasilescu");
		ClientAbonat clientAbonat3 = new ClientAbonat("Ionescu");
		
		Sala sala = new Sala("Sala sportiva");
		
		sala.aboneazaClient(clientAbonat3);
		sala.aboneazaClient(clientAbonat2);
		sala.aboneazaClient(clientAbonat1);
		sala.anuntaMeciVolei();
		sala.dezaboneazaClient(clientAbonat3);
		sala.anuntaMeciFotbal();
	}

}
