package creationalPatterns.singleton;

public class Singleton {

    private static Singleton istance = null;
    private static Integer cont;
    private Singleton() {};
    
    @Override
    public String toString() {
	return "Singleton [ "+ cont+" ] ";
    }

    public static Singleton getSingletonIstance() {
	if(istance == null) {
	    istance = new Singleton();
	    cont=1;
	}else
	    cont++;
	
	return istance;	    
    }
}
