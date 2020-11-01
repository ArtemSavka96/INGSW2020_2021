package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.Lampadina;
import creationalPatterns.abstractFactory.LampadinaIncandescente;

public class LampadinaIncandescenteTest {

    @Test
    public void lampadinaIncandescenteTest() {
	Lampadina l = new LampadinaIncandescente();
	System.out.println(l.toString());
	l.acceso();
	System.out.println(l.toString());
	System.out.println(l.getType());
	l.spento();
	System.out.println(l.toString());
    }
}
