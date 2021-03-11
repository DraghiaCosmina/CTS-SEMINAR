package ro.ase.cts.classes;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader)
			throws NumberFormatException, FileNotFoundException {

		return reader.citesteAplicanti();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantare pt student: " + Student.getSumaFinantare());
		System.out.println("Suma finantare pt elev: " + Elev.getSumaFinantare());
		System.out.println("Suma finantare pt angajat: " + Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");

		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			Proiect proiect = new Proiect(80);
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afiseazaStatus(proiect);
				System.out.println(aplicant.getSumaFinantata());}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
