package creationalPatterns.factoryMethodTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import creationalPatterns.factoryMethod.Auto;
import creationalPatterns.factoryMethod.AutoAudi;
import creationalPatterns.factoryMethod.AutoBMW;
import creationalPatterns.factoryMethod.AutoFiat;
import creationalPatterns.factoryMethod.ConcessionarioConcrete;

public class ConcessionarioConcreteTest {

    private ConcessionarioConcrete cc;
    private ConcessionarioConcrete cc2;
    
    @Test
    public void concessionarioConcreteTest() {
	cc = new ConcessionarioConcrete();
	cc2= new ConcessionarioConcrete(new ArrayList<Auto>());
	ArrayList<Auto> veicoli = new ArrayList<Auto>(Arrays.asList(new Auto(),new AutoAudi(),new AutoFiat(),new AutoBMW()));
	cc.addAuto(new AutoFiat());
	cc2.getVeicoli().addAll(veicoli);
	cc2.addAuto(new Auto());
	if(!cc2.equals(cc))
	    System.out.println("!=");
	System.out.println(cc.toString());
	System.out.println(cc2.toString());
    }
}
