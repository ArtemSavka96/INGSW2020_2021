package creationalPatterns.factoryMethod;

public class AutoFiat extends Auto{

    private static String marca="FIAT";

    public AutoFiat() {
	super();
    }

    public AutoFiat(String modello, Integer cavalli, Integer posti, Integer porte) {
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
	if (!(obj instanceof AutoFiat))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Auto Fiat: [modello=" + this.getModello() + ", cavalli=" + this.getCavalli()+ ", posti=" + this.getPosti()+ ", porte=" + this.getPorte()+ "]";
    }
    
}
