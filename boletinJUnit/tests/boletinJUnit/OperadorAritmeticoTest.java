package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author estudiante
 *
 */
class OperadorAritmeticoTest {

	static Stream <Arguments> datoSuma(){
		return Stream.of(
				Arguments.of(0,1,1),
				Arguments.of(4,5,9),
				Arguments.of(0,0,0),
				Arguments.of(-4,5,1),
				Arguments.of(4,-3,1),
				Arguments.of(-2,-3,-5)				
				);
	}
	
	static Stream <Arguments> datoDivision(){
		return Stream.of(
				Arguments.of(4,1,4),
				Arguments.of(4,2,2),
				Arguments.of(0,7,0),
				Arguments.of(-4,-2,2),
				Arguments.of(-4,2,-2),
				Arguments.of(4,-2,-2)
				);
	}
	
	@ParameterizedTest
	@MethodSource("datoSuma")
	void testSuma(int num1, int num2, int result) {
		assertEquals(OperadorAritmetico.suma(num1, num2),result);
	}

	@ParameterizedTest
	@MethodSource("datoDivision")
	void testDivision(int num1,int num2, int result) throws Exception {
		assertEquals(OperadorAritmetico.division(num1, num2),result);
	}
	
	@Test
	void testDivisionEntreCero() throws Exception {
		assertEquals(Exception,OperadorAritmetico.division(4,0));
	}
	

}
