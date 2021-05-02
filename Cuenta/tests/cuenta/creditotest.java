package cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class creditotest {

	@Test
	void testRetirar() throws Exception {
		Cuenta c1=new Cuenta("212","Paco");
		c1.retirar(0);
	}

	@Test
	void testIngresar() {
		fail("Not yet implemented");
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testLiquidar() {
		fail("Not yet implemented");
	}

}
