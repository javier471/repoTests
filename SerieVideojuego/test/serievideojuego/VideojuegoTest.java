package serievideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VideojuegoTest {

	Videojuego v1=new Videojuego();
	Videojuego v2=v1;
	@Test
	void testGetTitulo() {
		v1.setTitulo("cod");
		assertTrue(v1.getTitulo()=="cod");
	}

	@Test
	void testGetHorasEstimadas() {
		v1.setHorasEstimadas(31);
		assertEquals(31,v1.getHorasEstimadas());
	}

	@Test
	void testGetGenero() {
		v1.setGenero("shooter");
		assertTrue(v1.getGenero()=="shooter");
	}

	@Test
	void testGetcompañia() {
		v1.setcompañia("iw");
		assertTrue(v1.getcompañia()=="iw");
	}

	@Test
	void testEntregar() {
		v1.entregar();
		assertTrue(v1.isEntregado());
	}

	@Test
	void testDevolver() {
		v1.devolver();
		assertTrue(!v1.isEntregado());
	}

	@Test
	void testIsEntregado() {
		assertTrue(v1.isEntregado() || !v1.isEntregado());
	}

	@Test
	void testCompareTo() {
		assertTrue(v1.compareTo(v2)==0 ||v1.compareTo(v2)==1 || v1.compareTo(v2)==-1);
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsVideojuego() {
		fail("Not yet implemented");
	}

}
