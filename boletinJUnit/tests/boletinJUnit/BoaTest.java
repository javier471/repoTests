package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BoaTest {

	
	static Stream<Arguments> datos(){
		return Stream.of(
				Arguments.of("pepe",3,"granola bars",true),
				Arguments.of("pepe",3,"bars",false),
				Arguments.of("pepe",0,"",false),
				Arguments.of("pepe",3,null,true)
				);
	}
	
	@ParameterizedTest
	@MethodSource("datos")
	void testIsHealthy(String nombre, int longitud, String comida, Boolean resultado) {
		Boa b=new Boa(nombre,longitud,comida);
		assertEquals(resultado,b.isHealthy());
	}
	
	static Stream<Arguments> datos2(){
		return Stream.of(
				Arguments.of(3,false),
				Arguments.of(30,false),
				Arguments.of(35,true)				
				);
	}
	
	@ParameterizedTest
	@MethodSource("datos2")
	void testFitsInCage(int longitud,Boolean resultado) {
		//Boa b=new Boa(longitud,resultado);
	}
	
	

}
