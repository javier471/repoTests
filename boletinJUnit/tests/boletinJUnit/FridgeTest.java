package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FridgeTest {

	static Stream<Arguments> datos(){
		return Stream.of(
				Arguments.of("Leche","Leche",true),
				Arguments.of(null,"Leche",false),
				Arguments.of("Leche","Pan",false)
				);
	}
	@ParameterizedTest
	@MethodSource("datos")
	void testTake(String poner, String preguntar, Boolean resultado) {
		Fridge f=new Fridge();
		f.put(poner);
		try {
			f.take(poner);
			fail("Fallo");
		}
		catch (Exception e) {
			}
	}

	@Test
	void testTake1() {
		Fridge f=new Fridge();
		
	}

	@Test
	void testTake() {
		fail("Not yet implemented");
	}

}
