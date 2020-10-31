package creationalPatterns.factoryMethod;

public class AutoAudi extends Auto{

    private static String marca="Audi";

    public AutoAudi() {
	super();
    }

    public AutoAudi(String modello, Integer cavalli, Integer posti, Integer porte) {
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
	if (!(obj instanceof AutoAudi))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Auto Audi: [modello=" + this.getModello() + ", cavalli=" + this.getCavalli()+ ", posti=" + this.getPosti()+ ", porte=" + this.getPorte()+ "]";
    }
    
    
}
