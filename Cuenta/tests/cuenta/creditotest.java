package cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class creditotest {
	
	private Credito c1;
	@BeforeEach
	public void init() {
		Credito c1=new Credito("21212","Paco",null,500.00);
	}
	
	@Test
	void testRetirar() throws Exception  {
		c1.retirar(100.00);
		assertEquals(400.00,c1.getCreditoDisponible());
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
