package creationalPatterns.factoryMethod;

public class AutoBMW extends Auto{

    private static String marca="BMW";

    public AutoBMW() {
	super();
    }

    public AutoBMW(String modello, Integer cavalli, Integer posti, Integer porte) {
	super(modello, cavalli, posti, porte);
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (!(obj instanceof AutoBMW))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Auto BMW: [modello=" + this.getModello() + ", cavalli=" + this.getCavalli()+ ", posti=" + this.getPosti()+ ", porte=" + this.getPorte()+ "]";
    }
}
