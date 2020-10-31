package creationalPatterns.factoryMethod;

import java.util.ArrayList;

public class Concessionario {

    private ArrayList<Auto> veicoli;

    private void init() {
	veicoli=new ArrayList<Auto>();
    }
    
    public Concessionario() {
	super();
	init();
    }

    public Concessionario(ArrayList<Auto> veicoli) {
	super();
	this.veicoli = veicoli;
    }

    public ArrayList<Auto> getVeicoli() {
        return veicoli;
    }

    public void setVeicoli(ArrayList<Auto> veicoli) {
        this.veicoli = veicoli;
    }

    public Auto createAuto(){
	return new Auto();
    }
    
    public void addAuto(Auto a) {
	if(veicoli.isEmpty())
	    init();
	if(!veicoli.contains(a))
	    veicoli.add(a);
    }
    
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!(obj instanceof Concessionario))
	    return false;
	Concessionario other = (Concessionario) obj;
	if (veicoli == null) {
	    if (other.veicoli != null)
		return false;
	} else if (!veicoli.equals(other.veicoli))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Concessionario [ veicoli=" + veicoli + "]";
    }
    
    
}
