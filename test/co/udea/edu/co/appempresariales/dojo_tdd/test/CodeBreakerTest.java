/**
 * 
 */
package co.udea.edu.co.appempresariales.dojo_tdd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.udea.edu.co.appempresariales.dojo_tdd.CodeBreaker;

/**
 * @author jorge
 *
 */
public class CodeBreakerTest {

	CodeBreaker code;
	String test;
	
	@Test
	public void cuatroX(){
		code= new CodeBreaker();
		test = code.breaker("1234");
		assertEquals("XXXX", test);
	}
		
	@Test
	public void dosXdos_() {
		code= new CodeBreaker();
		test = code.breaker("2134");
		assertEquals("XX__", test);
	}

}
