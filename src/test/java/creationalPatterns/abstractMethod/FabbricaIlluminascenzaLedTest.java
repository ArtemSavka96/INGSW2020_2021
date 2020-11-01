package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.FabbricaIlluminazioneLed;
import creationalPatterns.abstractFactory.Lampadina;
import creationalPatterns.abstractFactory.Lampione;

public class FabbricaIlluminascenzaLedTest {

    @Test
    public void fabbricaIlluminazioneLedTest() {
	FabbricaIlluminazioneLed base = new FabbricaIlluminazioneLed();
	Lampadina lampadina = base.creaLampadina();
	Lampione lampione = base.creaLampione();
	System.out.println(lampadina.toString());
	System.out.println(lampione.toString());
    }
}
