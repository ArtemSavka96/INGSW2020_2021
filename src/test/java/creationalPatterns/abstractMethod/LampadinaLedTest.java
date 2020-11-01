package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.Lampadina;
import creationalPatterns.abstractFactory.LampadinaLed;

public class LampadinaLedTest {

    @Test
    public void lampadinaLedTest() {
	Lampadina l = new LampadinaLed();
	System.out.println(l.toString());
	l.acceso();
	System.out.println(l.toString());
	System.out.println(l.getType());
	l.spento();
	System.out.println(l.toString());
    }
}
