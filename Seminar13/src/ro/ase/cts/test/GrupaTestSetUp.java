package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateTests;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.Student;

public class GrupaTestSetUp {
	Grupa grupa ;
	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1010);
		for (int i = 1; i < 36; i++) {
			Student student = new Student();
			student.adaugaNota(i % 10 + 1);
			grupa.adaugaStudent(student);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 100)
	@Category(GetPromovabilitateTests.class)
	public void performantaPromovabilitateTest() {
			
		grupa.getPromovabilitate();
	}

}
