package creationalPatterns.prototype;

public interface Giocatore {
    String nome = null;
    String cognome = null;
    Integer valore = null;
    Integer prezzo = null;
    public Giocatore clone();
    public String stampaGiocatore();
}
