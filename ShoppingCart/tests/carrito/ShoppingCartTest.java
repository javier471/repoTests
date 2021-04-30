package carrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	private ShoppingCart carro;
	@BeforeEach
	public void init() {
		carro=new ShoppingCart();
	}
	@Test
	void testShoppingCart() {
		assertEquals(0,carro.getItemCount());
	}
	@Test
	void testAddItem() {
		carro.addItem(new Product ("Intel",900));
		assertEquals(1,carro.getItemCount());
		carro.addItem(new Product ("AMD",500));
		assertEquals(1400,carro.getBalance());
	}

	@Test
	void testRemoveItem() throws ProductNotFoundException {
		Product intel=new Product ("Intel",900);
		carro.addItem(intel);
		carro.removeItem(intel);
		assertEquals(1,carro.getItemCount());
		
		try {
			carro.addItem(intel);
			carro.removeItem(new Product("ars",788));
			fail("Se deberia haber lanzado la excepcion");
		}catch (ProductNotFoundException excepcion) {
			assertEquals(2,carro.getItemCount());
		}
	}

	@Test
	void testEmpty() {	
		carro.addItem(new Product ("Intel",900));
		carro.empty();
		assertEquals(0,carro.getItemCount());

	}

}
