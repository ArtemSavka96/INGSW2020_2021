package creationalPatterns.abstractFactory;

public class LampioneLed implements Lampione{

    private static String type = " led ";
    private boolean stato = false;
    
    @Override
    public String toString() {
	return "Lampione Led, stato: " + stato;
    }

    @Override
    public void acceso() {
	this.stato=true;	
    }

    @Override
    public void spento() {
	this.stato=false;	
    }

    @Override
    public String getType() {
	return type;
    }
}
