package creationalPatterns.abstractFactory;

public class LampioneIncandescente implements Lampione{
    
    private static String type = " incandescente ";
    private boolean stato = false;
    
    @Override
    public String toString() {
	return "Lampione Incandescente, stato: " + stato;
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
