package ro.ase.cts.command.main;

import ro.ase.cts.command.classes.ComandaConstituire;
import ro.ase.cts.command.classes.ComandaDepunere;
import ro.ase.cts.command.classes.ComandaRetragere;
import ro.ase.cts.command.classes.ContBancar;
import ro.ase.cts.command.classes.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(new ContBancar("Cosmina"), 500));
		manager.invoca(new ComandaRetragere(new ContBancar("Alisa"), 200));
		manager.executaComanda();
		
		manager.invoca(new ComandaDepunere(new ContBancar("Oana"), 100));
		manager.executaComanda();
		manager.executaComanda();

	}

}
