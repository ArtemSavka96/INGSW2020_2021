package creationalPatterns.factoryMethodTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import creationalPatterns.factoryMethod.Auto;
import creationalPatterns.factoryMethod.AutoAudi;
import creationalPatterns.factoryMethod.AutoBMW;
import creationalPatterns.factoryMethod.AutoFiat;
import creationalPatterns.factoryMethod.Concessionario;

public class ConcessionarioTest {

    private Concessionario concessionario;
    private Concessionario concessionario2;
    
    @Test
    public void concessionarioTest() {
	concessionario = new Concessionario();
	concessionario2 = new Concessionario(new ArrayList<Auto>());
	ArrayList<Auto> veicoli = new ArrayList<Auto>(Arrays.asList(new Auto(),new AutoAudi(),new AutoFiat(),new AutoBMW()));
	concessionario.addAuto(new AutoFiat());
	concessionario.getVeicoli().addAll(veicoli);
	concessionario2.addAuto(new Auto());
	if(!concessionario.equals(concessionario2))
	    System.out.println("!=");
	System.out.println(concessionario.toString());
	System.out.println(concessionario2.toString());
    }
    
}
