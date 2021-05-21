package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaTest {

	@Test
	void testPush() {
		Pila p=new Pila();
		p.push(10);
		assertEquals(10,p.pop());
	}

	@Test
	void testPop() {
		Pila p=new Pila();
		p.push(4);
		p.push(8);
		assertEquals(8,p.pop());
	}

	@Test
	void testIsEmpty() {
		Pila p=new Pila();
		assertEquals(true,p.isEmpty());
	}

	@Test
	void testTop() {
		Pila p=new Pila();
	}

}
