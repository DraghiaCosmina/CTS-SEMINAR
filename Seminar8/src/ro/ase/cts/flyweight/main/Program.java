package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.classes.FlyweightFactory;
import ro.ase.cts.flyweight.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1,3,"12.09");
		Rezervare rezervare2 = new Rezervare(3,5,"16.09");
		Rezervare rezervare3 = new Rezervare(4,5,"12.09");
		
		FlyweightFactory factory = new FlyweightFactory();
		factory.getClient("alisa@gmail.com").afisareInformatii(rezervare1);
		factory.getClient("alisa@gmail.com").afisareInformatii(rezervare2);
		factory.getClient("alisa2@gmail.com").afisareInformatii(rezervare3);
		
	}

}
