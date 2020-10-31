package creationalPatterns.factoryMethodTest;

import org.junit.Test;

import creationalPatterns.factoryMethod.Auto;

public class AutoTest {

    private Auto auto;
    private Auto auto2;
    private Auto auto3;
        
    @Test
    public void testAuto() {
	auto = new Auto();
	auto2 = new Auto("Famigliare", 300, 5, 3);
	auto3 = auto2;
	System.out.println(auto.toString());
	auto.setCavalli(250);
	auto.setModello("Suv");
	auto.setPorte(5);
	auto.setPosti(5);
	System.out.println(auto.toString());
	System.out.println(auto2.toString());
	System.out.println(auto2.getModello());
	System.out.println(auto2.getCavalli());
	System.out.println(auto2.getPorte());
	System.out.println(auto2.getPosti());
	if(auto.equals(auto))
	    System.out.println("==");
	else
	    System.out.println("!=");
	if(auto2.equals(auto3))
	    System.out.println("==");
	else
	    System.out.println("!=");
	if(auto3.equals(auto))
	    System.out.println("==");
	else
	    System.out.println("!=");
    }

}
