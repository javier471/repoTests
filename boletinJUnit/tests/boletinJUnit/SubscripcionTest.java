package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	void testPrecioPorMes() {
		Subscripcion s1=new Subscripcion(100,4);
		Subscripcion s2=new Subscripcion(1000,45);

		assertEquals(25,s1.precioPorMes());
		assertEquals(22.23,s2.precioPorMes());
		
	}

	@Test
	void testCancel() {
		Subscripcion s1=new Subscripcion(100,4);	
		s1.cancel();
		assertEquals(0,s1.precioPorMes());
	}

}

