package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.Lampione;
import creationalPatterns.abstractFactory.LampioneIncandescente;

public class LampioneIncandescenteTest {

    @Test
    public void lampioneIncandescenteTest() {
	Lampione l = new LampioneIncandescente();
	System.out.println(l.toString());
	l.acceso();
	System.out.println(l.toString());
	System.out.println(l.getType());
	l.spento();
	System.out.println(l.toString());
    }
}
