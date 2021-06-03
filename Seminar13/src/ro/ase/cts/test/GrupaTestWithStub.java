package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateTests;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.test.claseDubluri.StudentStub;

public class GrupaTestWithStub {
	private IStudent studentStub;
	@Before
	public void setUp() throws Exception {
		studentStub = new StudentStub();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category(GetPromovabilitateTests.class)
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
		
	}

}
