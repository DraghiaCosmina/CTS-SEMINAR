package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testAdaugaNotaInLista() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test

	public void testListaSize() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}

	@Test
	public void testCalcuzeazaMediaONota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalcuzeazaMediaTreiNote() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 6;
		float medie = (nota1 + nota2 + nota3) / 3.0f;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalcuzeazaMediaFaraNoteAdaugate() {
		Student student = new Student();

		assertEquals(0, student.calculeazaMedie(), 0.01);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNota() {
		Student student = new Student();

		int nota = 8;
		student.adaugaNota(nota);

		assertEquals(nota, student.getNota(-1));
	}

//	@Test 
//	public void testGetNotaJU5() {
//		Student student = new Student();
//		
//		int nota = 8;
//		student.adaugaNota(nota);
//		
//		assertThrows(IndexOutOfBoundsExpecteption.class,()->student.getNota(-1));
//	}
	@Test
	public void testGetNotaJU3() {
		Student student = new Student();

		int nota = 8;
		//1
		try {
			//2
			int x = student.getNota(-1);
			//3
			fail("Testul a picat pentru ca nu a aruncat exceptia");
		} catch (IndexOutOfBoundsException eroare) {
			//4
		}	
		//5
		
		
	}
	@Test 
	public void testVerificaAreRestante() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertTrue(student.areRestante());
		
	}
	@Test 
	public void testVerificaNuAreRestante() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertFalse(student.areRestante());
		
	}

}
