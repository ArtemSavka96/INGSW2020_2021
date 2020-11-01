package creationalPatterns.abstractFactory;

public class FabbricaIlluminazioneIncandescenza implements FabbricaIlluminazioneBase {

    @Override
    public Lampione creaLampione() {
	return new LampioneIncandescente();
    }

    @Override
    public Lampadina creaLampadina() {
	return new LampadinaIncandescente();
    }

}
