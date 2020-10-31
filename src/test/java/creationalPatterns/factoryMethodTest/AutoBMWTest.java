package creationalPatterns.factoryMethodTest;

import org.junit.Test;

import creationalPatterns.factoryMethod.Auto;
import creationalPatterns.factoryMethod.AutoBMW;

public class AutoBMWTest {


    private AutoBMW bmw;
    private Auto auto;
    
    @Test
    public void autoFiatTest() {
	auto = new AutoBMW("Famigliare", 300, 5, 3);
	bmw = new AutoBMW();
	
	System.out.println(auto.toString());
	System.out.println(bmw.getMarca());
	if(!bmw.equals(auto))
	    System.out.println("!=");
	
    }
}
