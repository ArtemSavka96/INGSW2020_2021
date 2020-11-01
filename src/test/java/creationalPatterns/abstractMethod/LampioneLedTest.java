package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.Lampione;
import creationalPatterns.abstractFactory.LampioneLed;

public class LampioneLedTest {

    @Test
    public void lampioneLedTest() {
	Lampione l = new LampioneLed();
	System.out.println(l.toString());
	l.acceso();
	System.out.println(l.toString());
	System.out.println(l.getType());
	l.spento();
	System.out.println(l.toString());
    }
}
