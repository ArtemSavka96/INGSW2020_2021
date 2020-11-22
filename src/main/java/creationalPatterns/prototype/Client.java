package creationalPatterns.prototype;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class Client {    

    public static void main(String[] args) {
	final ArrayList<Giocatore> giocatori = new ArrayList<>();

	final JFrame frame = new JFrame("MyDreamTeam");
	final JPanel mainPanel = new JPanel();
	
	JButton insert = new JButton("Aggiungi");
	JButton stampa = new JButton("Stampa");
	
	final JTextArea rosa = new JTextArea();
	rosa.setFocusable(false);
	
	final JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, mainPanel, rosa);

	frame.setSize(800, 800);
	frame.setVisible(true);

	mainPanel.setBackground(Color.CYAN);

	mainPanel.add(insert);
	mainPanel.add(stampa);
	
	frame.add(splitPane);

	insert.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		int ris=JOptionPane.showConfirmDialog(null, "Vuoi inserire un giocatore?");;
		while(ris == JOptionPane.YES_OPTION){
		    Giocatore tmp=null;

		    String nome = JOptionPane.showInputDialog("Inserisci il nome:");
		    String cognome = JOptionPane.showInputDialog("Inserisci il cognome:");
		    String valore = JOptionPane.showInputDialog("Inserisci il valore:");
		    String prezzo = JOptionPane.showInputDialog("Inserisci il prezzo:");

		    Integer val=Integer.parseInt(valore);
		    Integer pre=Integer.parseInt(prezzo);

		    String ruolo = JOptionPane.showInputDialog("Inserisci il ruolo:");
		    switch (ruolo) {
		    case "Portiere":
			tmp = new Portiere(nome,cognome,val,pre);
			break;
		    case "Difensore":
			tmp = new Difensore(nome,cognome,val,pre);
			break;
		    case "Centrocampista":
			tmp = new Centrocampista(nome,cognome,val,pre);
			break;
		    case "Attaccante":
			tmp = new Attaccante(nome,cognome,val,pre);
			break;

		    default:
			JOptionPane.showMessageDialog(null, "Ruolo non valido.");
		    }

		    giocatori.add(tmp.clone());		    
		    ris=JOptionPane.showConfirmDialog(null, "Vuoi inserire un giocatore?");
		}
	    }
	});

	stampa.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		if(giocatori.isEmpty()) {
		    JOptionPane.showMessageDialog(null, "ERRORE: Non ci sono giocatori");
		}else {
		    
		    for(Giocatore g: giocatori) {
			rosa.append(g.stampaGiocatore()+'\n');
		    }
		    rosa.repaint();
		}
	    }

	});

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
