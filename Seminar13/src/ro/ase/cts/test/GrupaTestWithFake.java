package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateTests;
import ro.ase.cts.categorii.NormalTests;
import ro.ase.cts.categorii.UrgentTest;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.test.claseDubluri.StudentFake;

public class GrupaTestWithFake {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category({UrgentTest.class, GetPromovabilitateTests.class})
	public void promovabilitateTest() {
		StudentFake studentFake = new StudentFake();
		studentFake.setAreRestante(false);
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
		
	}
	@Test
	@Category({NormalTests.class, GetPromovabilitateTests.class})
	public void promovabilitateCuRestanteTest() {
		StudentFake studentFake = new StudentFake();
		studentFake.setAreRestante(true);
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentFake);
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
		
	}
		

}
