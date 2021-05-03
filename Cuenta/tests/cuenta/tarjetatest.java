package cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class tarjetatest {
	
	private Tarjeta t1;
	@BeforeEach
	public void init() {
		Tarjeta t1=new Tarjeta("21212","Paco",null);
	}

	@Test
	void testRetirar() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresar() {
		fail("Not yet implemented");
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

}
