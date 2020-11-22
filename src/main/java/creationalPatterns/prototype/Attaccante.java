package creationalPatterns.prototype;

public class Attaccante implements Giocatore {

    public String nome;
    public String cognome;
    public Integer valore;
    public Integer prezzo; 
    public static final String ruolo = "Attaccante";
    
    public Attaccante(String nome, String cognome, Integer valore, Integer prezzo) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.valore = valore;
	this.prezzo = prezzo;
    }

    public Attaccante() {
	super();
    }

    @Override
    public Giocatore clone(){
	return new Attaccante(this.nome,this.cognome,this.valore,this.prezzo);
    }
    
    @Override
    public String stampaGiocatore() {
	return Attaccante.ruolo+": "+this.cognome+" "+this.nome+", valore: "+this.valore+", prezzo: "+this.prezzo;
    }


}
