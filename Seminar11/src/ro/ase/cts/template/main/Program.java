package ro.ase.cts.template.main;

import ro.ase.cts.template.classes.Spectator;
import ro.ase.cts.template.classes.SpectatoriPeluza;

public class Program {

	public static void main(String[] args) {
		Spectator spectator = new Spectator();
		
		spectator.intrareaSpectatoruluiPeStadion();
		SpectatoriPeluza spectatorPeluza = new SpectatoriPeluza();
		
		spectatorPeluza.intrareaSpectatoruluiPeStadion();
	}

}
