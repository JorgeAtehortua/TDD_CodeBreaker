package co.udea.edu.co.appempresariales.dojo_tdd.test;

import static org.junit.Assert.*;
import co.udea.edu.co.appempresariales.dojo_tdd.calculator;

import org.junit.Test;
/**
 * @author jorge
 **/

public class calculatorTest {

	calculator c;
	int r;
	
	//prueba para sumar 1+1
	@Test
	public void add_1_1() {
		c = new calculator(); 	//arranque
		r = c.add(1,1);					//Dato actual
		assertEquals(2, r);					//Assert prueba
	}
	//prueba para sumar 2+2
	@Test
	public void add_2_2() {
		c = new calculator(); 	//arranque
		r = c.add(2,2);					//Dato actual
		assertEquals(4, r);					//Assert prueba
	}
}
