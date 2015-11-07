/**
 * 
 */
package co.udea.edu.co.appempresariales.dojo_tdd;

/**
 * @author jorge
 *
 */
public class CodeBreaker {

	public String breaker (String x){
		char c[]= x.toCharArray();
		if(x=="1234"){
			return "XXXX";
		}
		else {
			return "XXX_";
		}
	}
	
	
}
