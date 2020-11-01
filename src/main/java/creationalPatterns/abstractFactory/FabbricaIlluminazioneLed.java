package creationalPatterns.abstractFactory;

public class FabbricaIlluminazioneLed implements FabbricaIlluminazioneBase{

    @Override
    public Lampione creaLampione() {
	return new LampioneLed();
    }

    @Override
    public Lampadina creaLampadina() {
	return new LampadinaLed();
    }

}
