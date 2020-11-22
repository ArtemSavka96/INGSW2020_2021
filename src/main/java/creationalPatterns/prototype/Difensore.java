package creationalPatterns.prototype;

public class Difensore implements Giocatore {
    public String nome;
    public String cognome;
    public Integer valore;
    public Integer prezzo; 
    public static final String ruolo = "Difensore";
    
    public Difensore(String nome, String cognome, Integer valore, Integer prezzo) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.valore = valore;
	this.prezzo = prezzo;
    }

    public Difensore() {
	super();
    }

    @Override
    public Giocatore clone(){
	return new Difensore(this.nome,this.cognome,this.valore,this.prezzo);
    }
    
    @Override
    public String stampaGiocatore() {
	return Difensore.ruolo+": "+this.cognome+" "+this.nome+", valore: "+this.valore+", prezzo: "+this.prezzo;
    }


}
