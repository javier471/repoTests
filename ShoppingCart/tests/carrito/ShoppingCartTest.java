package carrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import carrito.Product;
import carrito.ProductNotFoundException;
import carrito.ShoppingCart;

class ShoppingCartTest {
	ShoppingCart carro;
	@BeforeEach 
	public void init() {
		carro = new ShoppingCart();
	}
	
	@Test
	void testShoppingCart() {
		assertEquals(0, carro.getItemCount());
	}
	
	@Test
	void testEmpty() {
		carro.empty();
		assertEquals(0, carro.getItemCount());
	}

	@Test
	void testAddItem() {
		carro.addItem(new Product("Intel 11900K", 900.0));
		assertEquals(1, carro.getItemCount());
		carro.addItem(new Product("Amd Ryzen 5600G", 600.0));
		assertEquals(1500 , carro.getBalance());
	}
	
	@Test
	void testRemoveItem() throws ProductNotFoundException {
		Product intel = new Product("Intel 11900K", 900.0);
		
		carro.addItem(intel);
		carro.addItem(new Product("Amd Ryzen 5600G", 600.0));
		
		carro.removeItem(intel);
		
		assertEquals(1 , carro.getItemCount());
		
		try {
			carro.addItem(intel);
			carro.removeItem(new Product("Arm Cortex A55", 99.0));
			fail("Se debería haber lanzado una excepción debido a que el articulo no está en el carro");
		}
		catch (ProductNotFoundException excepcionGenerada) {
			assertEquals(2, carro.getItemCount());
		}
	}
}