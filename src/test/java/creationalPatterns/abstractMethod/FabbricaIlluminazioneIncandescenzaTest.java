package creationalPatterns.abstractMethod;

import org.junit.Test;

import creationalPatterns.abstractFactory.FabbricaIlluminazioneIncandescenza;
import creationalPatterns.abstractFactory.Lampadina;
import creationalPatterns.abstractFactory.Lampione;

public class FabbricaIlluminazioneIncandescenzaTest {

    @Test
    public void fabbricaIlluminazioneIncandescenzaTest() {
	FabbricaIlluminazioneIncandescenza base = new FabbricaIlluminazioneIncandescenza();
	Lampadina lampadina = base.creaLampadina();
	Lampione lampione = base.creaLampione();
	System.out.println(lampadina.toString());
	System.out.println(lampione.toString());
    }
}
