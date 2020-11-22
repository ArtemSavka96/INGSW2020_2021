package creationalPatterns.prototype;

public class Portiere implements Giocatore {

    public String nome;
    public String cognome;
    public Integer valore;
    public Integer prezzo; 
    public static final String ruolo = "Portiere";
    
    public Portiere(String nome, String cognome, Integer valore, Integer prezzo) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.valore = valore;
	this.prezzo = prezzo;
    }

    public Portiere() {
	super();
    }

    @Override
    public Giocatore clone(){
	return new Portiere(this.nome,this.cognome,this.valore,this.prezzo);
    }
    
    @Override
    public String stampaGiocatore() {
	return Portiere.ruolo+": "+this.cognome+" "+this.nome+", valore: "+this.valore+", prezzo: "+this.prezzo;
    }

}
