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

	@ParameterizedTest
	@MethodSource("datos")
	void testTake1(String poner,String preguntar, Boolean resultado) {
		
	}
	
	
	@Test
	void testput() {
		Fridge f=new Fridge();
		f.put("pan");
		assertEquals(true, f.contains("pan"));
		
	}

	

}
