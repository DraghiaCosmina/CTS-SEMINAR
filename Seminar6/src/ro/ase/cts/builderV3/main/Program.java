package ro.ase.cts.builderV3.main;

import ro.ase.cts.builderV3.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = Rezervare.builder().setBauturaRacoritoare(true).build();
		System.out.println(rezervare);
		
		

	}

}
