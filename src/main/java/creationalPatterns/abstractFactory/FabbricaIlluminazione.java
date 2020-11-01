package creationalPatterns.abstractFactory;

public class FabbricaIlluminazione implements FabbricaIlluminazioneBase{

    @Override
    public Lampione creaLampione() {
	return new Lampione() {
	    
	    @Override
	    public void spento() {
		// TODO Auto-generated method stub
		
	    }
	    
	    @Override
	    public String getType() {
		// TODO Auto-generated method stub
		return null;
	    }
	    
	    @Override
	    public void acceso() {
		// TODO Auto-generated method stub
		
	    }
	};
    }

    @Override
    public Lampadina creaLampadina() {
	return new Lampadina() {
	    
	    @Override
	    public void spento() {
		// TODO Auto-generated method stub
		
	    }
	    
	    @Override
	    public String getType() {
		// TODO Auto-generated method stub
		return null;
	    }
	    
	    @Override
	    public void acceso() {
		// TODO Auto-generated method stub
		
	    }
	};
    }

}
