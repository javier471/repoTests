package cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class cuentatest {

	
	private Cuenta c1;
	@BeforeEach
	public void init() {
		c1=new Cuenta("21212","Paco");
	}
	
	@Test
	void testIngresarDouble() throws Exception {
		try {
			c1.ingresar(20);
		assertEquals(20,c1.getSaldo());
		}catch(Exception e) {
			fail("No debería lanzar exception");
		}
		
	}

	@Test
	void testIngresarDouble1() throws Exception {
		try {
			c1.ingresar(-5);
			fail("Debería lanzar exception");
		}catch(Exception e) {
			
		}
		
	}

	@Test
	void testRetirarDouble() throws Exception {
		c1.retirar(10);
		assertEquals(10,c1.getSaldo());
	}

	@Test
	void testIngresarStringDouble() throws Exception {
		//c1.ingresar(20,"mov");
		assertEquals(20,c1.getSaldo());
	}

	@Test
	void testRetirarStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSaldo() {
		assertEquals(0,c1.getSaldo());
	}

}
