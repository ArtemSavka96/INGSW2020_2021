package creationalPatterns.prototype;

public class Centrocampista implements Giocatore{
    public String nome;
    public String cognome;
    public Integer valore;
    public Integer prezzo; 
    public static final String ruolo = "Centrocampista";
    
    public Centrocampista(String nome, String cognome, Integer valore, Integer prezzo) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.valore = valore;
	this.prezzo = prezzo;
    }

    public Centrocampista() {
	super();
    }

    @Override
    public Giocatore clone(){
	return new Centrocampista(this.nome,this.cognome,this.valore,this.prezzo);
    }
    
    @Override
    public String stampaGiocatore() {
	return Centrocampista.ruolo+": "+this.cognome+" "+this.nome+", valore: "+this.valore+", prezzo: "+this.prezzo;
    }


}
