package creationalPatterns.factoryMethodTest;

import org.junit.Test;

import creationalPatterns.factoryMethod.Auto;
import creationalPatterns.factoryMethod.AutoFiat;

public class AutoFiatTest {

    private AutoFiat fiat;
    private Auto auto;
    
    @Test
    public void autoFiatTest() {
	auto = new AutoFiat("Famigliare", 300, 5, 3);
	fiat = new AutoFiat();
	
	System.out.println(auto.toString());
	System.out.println(fiat.getMarca());
	if(!fiat.equals(auto))
	    System.out.println("!=");
	
    }
}
