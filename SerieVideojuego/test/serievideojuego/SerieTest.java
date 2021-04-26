package serievideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerieTest {
	
	Serie s1=new Serie();
	Serie s2=s1;
	@Test
	void testGetTitulo() {
	s1.setTitulo("twd");
	assertTrue(s1.getTitulo()=="twd");
	}
	@Test
	void testGetnumeroTemporadas() {
		s1.setnumeroTemporadas(2);
		assertTrue(s1.getnumeroTemporadas()==2);
	}

	@Test
	void testGetGenero() {
		s1.setGenero("comedia");
		assertTrue(s1.getGenero()=="comedia");
	}

	@Test
	void testGetcreador() {
		s1.setcreador("paco");
		assertTrue(s1.getcreador()=="paco");
	}

	@Test
	void testEntregar() {
		s1.entregar();
		assertTrue(s1.isEntregado());
	}

	@Test
	void testDevolver() {
		s1.devolver();
		assertTrue(!s1.isEntregado());
	}

	@Test
	void testIsEntregado() {
		assertEquals(false,s1.isEntregado());//como está a vacío debe devolver false
		s1.entregar();
		assertEquals(true,s1.isEntregado());//una vez lo hemos entregado nos tiene que devolver true
		
	}

	@Test
	void testCompareTo() {
		s1.setnumeroTemporadas(10);
		Serie aux=new Serie();
		aux.setnumeroTemporadas(8);
		assertEquals(1,s1.compareTo(aux));
	}

	@Test
	void testToString() {
		String cadena="";
	}

	@Test
	void testEqualsSerie() {
		assertTrue(s1.equals(s2));
	}

}
