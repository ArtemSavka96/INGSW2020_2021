package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.FabbricaIlluminazione;
import creationalPatterns.abstractFactory.FabbricaIlluminazioneBase;
import creationalPatterns.abstractFactory.Lampadina;
import creationalPatterns.abstractFactory.Lampione;

public class FabbricaIlluminazioneBaseTest {

    @Test
    public void fabbricaIlluminazioneBaseTest() {
	FabbricaIlluminazioneBase base = new FabbricaIlluminazione();
	Lampadina lampadina = base.creaLampadina();
	Lampione lampione = base.creaLampione();
	System.out.println(lampadina.toString());
	System.out.println(lampione.toString());
    }
}
