package creationalPatterns.factoryMethodTest;

import org.junit.Test;

import creationalPatterns.factoryMethod.Auto;
import creationalPatterns.factoryMethod.AutoAudi;

public class AutoAudiTest {


    private AutoAudi audi;
    private Auto auto;
    
    @Test
    public void autoFiatTest() {
	auto = new AutoAudi("Famigliare", 300, 5, 3);
	audi = new AutoAudi();
	
	System.out.println(auto.toString());
	System.out.println(audi.getMarca());
	if(!audi.equals(auto))
	    System.out.println("!=");
	
    }
}
