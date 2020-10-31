package creationalPatterns.factoryMethod;

public class Auto {

    private String modello;
    private Integer cavalli;
    private Integer posti;
    private Integer porte;
    
    public Auto() {
	super();
    }
    
    public Auto(String modello, Integer cavalli, Integer posti, Integer porte) {
	super();
	this.modello = modello;
	this.cavalli = cavalli;
	this.posti = posti;
	this.porte = porte;
    }
    
    public String getModello() {
        return modello;
    }
    
    public void setModello(String modello) {
        this.modello = modello;
    }
    
    public Integer getCavalli() {
        return cavalli;
    }
    
    public void setCavalli(Integer cavalli) {
        this.cavalli = cavalli;
    }
    
    public Integer getPosti() {
        return posti;
    }
    
    public void setPosti(Integer posti) {
        this.posti = posti;
    }
    
    public Integer getPorte() {
        return porte;
    }
    
    public void setPorte(Integer porte) {
        this.porte = porte;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!(obj instanceof Auto))
	    return false;
	Auto other = (Auto) obj;
	if (cavalli == null) {
	    if (other.cavalli != null)
		return false;
	} else if (!cavalli.equals(other.cavalli))
	    return false;
	if (modello == null) {
	    if (other.modello != null)
		return false;
	} else if (!modello.equals(other.modello))
	    return false;
	if (porte == null) {
	    if (other.porte != null)
		return false;
	} else if (!porte.equals(other.porte))
	    return false;
	if (posti == null) {
	    if (other.posti != null)
		return false;
	} else if (!posti.equals(other.posti))
	    return false;
	return true;
    }
    
    @Override
    public String toString() {
	return "Auto [ modello=" + modello + ", cavalli=" + cavalli + ", posti=" + posti + ", porte=" + porte + "]";
    }
}
