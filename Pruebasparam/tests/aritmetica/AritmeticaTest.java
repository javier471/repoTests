package aritmetica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AritmeticaTest {

	
	static Stream <Arguments> datosSuma(){
		return Stream.of(
				Arguments.of(3,4,7),
				Arguments.of(-3,-4,-7),
				Arguments.of(-3,4,1),
				Arguments.of(3,-4,-1)
				);
	}
	
	static Stream <Arguments> datosResta(){
		return Stream.of(
				Arguments.of(4,3,1),
				Arguments.of(3,4,-1),
				Arguments.of(-3,-4,1),
				Arguments.of(-3,4,-7),
				Arguments.of(4,-5,9)				
				);
	}
	
	static Stream <Arguments> datosMultiplicacion(){
		return Stream.of(
				Arguments.of(1,1,1),
				Arguments.of(1,4,4),
				Arguments.of(2,4,8),
				Arguments.of(1,0,0),
				Arguments.of(-4,-3,12),
				Arguments.of(2,-4,-8)
				);
		}
	
	static Stream <Arguments> datosDivision(){
		return Stream.of(
				Arguments.of(1,1,1),
				Arguments.of(2,4,0.5),
				Arguments.of(4,1,1),
				Arguments.of(4,2,2),
				Arguments.of(4,-2,-2),
				Arguments.of(-4,2,2)
				);
				
	}
	@ParameterizedTest
	@MethodSource("datosSuma")
	void testSuma(float num1, float num2, float resul) {
		Aritmetica2 a=new Aritmetica2();
		assertEquals(a.suma(num1, num2),resul);
		
	}
	
	

	@ParameterizedTest
	@MethodSource("datosResta")
	void testResta(float num1, float num2, float resul) {
		Aritmetica2 a=new Aritmetica2();
		assertEquals(a.resta(num1, num2),resul);
		
	}

	@ParameterizedTest
	@MethodSource("datosMultiplicacion")
	void testMultiplicacion(float num1, float num2, float resul) {
		Aritmetica2 a=new Aritmetica2();
		assertEquals(a.multiplicacion(num1, num2),resul);
	}

	@ParameterizedTest
	@MethodSource("datosDivision")
	void testDivision(float num1, float num2, float resul) {
		Aritmetica2 a=new Aritmetica2();
		assertEquals(a.division(num1, num2),resul);
	}

}
