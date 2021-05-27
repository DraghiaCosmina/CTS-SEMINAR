package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.Student;

public class GrupaTest {
//	Grupa grupa;
	@Before
	public void setUp() throws Exception {
//		grupa = new Grupa(1010);
//		for (int i = 1; i < 36; i++) {
//			Student student = new Student();
//			student.adaugaNota(i % 10 + 1);
//			grupa.adaugaStudent(student);
//		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1055);
		assertEquals(1055, grupa.getNrGrupa());
	}

	@Test
	public void limitaInferioaraTest() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void limitaSuperioaraTest() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);
	}

	@Test(timeout = 1000)
	public void performantaTest() {
		Grupa grupa = new Grupa(1055);

	}

	@Test
	public void corectitudinePromovabillitateTest() {
		Grupa grupa = new Grupa(1010);
		for (int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);

		}
		assertEquals(0.6f, grupa.getPromovabilitate(), .001f);
	}

	@Test
	public void limitaInferioarePromovabilitateTest() {
		Grupa grupa = new Grupa(1010);
		for (int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);

		}
		assertEquals(0.0f, grupa.getPromovabilitate(), .001f);
	}

	@Test
	public void limitaSuperioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1010);
		for (int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);

		}
		assertEquals(1f, grupa.getPromovabilitate(), .001f);
	}

	@Test
	public void limitePromovabilitateTest() {
		Grupa grupa = new Grupa(1010);
		assertEquals(0, grupa.getPromovabilitate(), 0.001f);
	}

//	@Test(timeout = 100)
//	public void performantaPromovabilitateTest() {
//		grupa.getPromovabilitate();
//	}
//	
	@Test
	public void cardinalityPromovabilitateTest() {
		Grupa grupa = new Grupa(1050);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		
		assertEquals(1f, grupa.getPromovabilitate(),0.001f);
	}
}
	
