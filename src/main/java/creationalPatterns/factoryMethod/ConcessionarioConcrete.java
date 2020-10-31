package creationalPatterns.factoryMethod;

import java.util.ArrayList;

public class ConcessionarioConcrete extends Concessionario{

    private static String name="Concessionario Concrete";

    public ConcessionarioConcrete() {
	super();
    }

    public ConcessionarioConcrete(ArrayList<Auto> veicoli) {
	super(veicoli);
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
	return "Concessionario Concrete: [ veicoli presenti =" + this.getVeicoli() + "]";
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (!(obj instanceof ConcessionarioConcrete))
	    return false;
	return true;
    }

}
