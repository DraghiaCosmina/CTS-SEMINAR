package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.classes.IRezervare;
import ro.ase.cts.proxy.classes.ProxyRezervare;
import ro.ase.cts.proxy.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		IRezervare rezervare = new Rezervare(3, 2);
		rezervare.anuntaRezervare();
		
		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervare);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervare).setNrPersoane(5);
		proxy.anuntaRezervare();

	}

}
