package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Student;

public class StudentReader extends AplicantReader {

	public StudentReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<>();

		while (input.hasNext()) {
			Student student = new Student();
			super.citesteAplicant(input, student);
			student.setAnStudii(input.nextInt());
			student.setFacultate(input.next());

			studenti.add(student);
		}
		input.close();
		return studenti;
	}

}
