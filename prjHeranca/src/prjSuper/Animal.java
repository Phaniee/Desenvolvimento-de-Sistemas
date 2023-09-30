package prjSuper;
import javax.swing.JOptionPane;

public class Animal {
	    protected String nome;//usando protected pois ele está conectado com herança

	    public Animal(String nome) {
//quando usamos this significa que estamos iniciando o atributo falando que ele vai receber ele mesmo
	    	this.nome = nome;
	    }
//metodo criado para servir de herança nas outras classes
	    public void emitirSom() {
	    	JOptionPane.showMessageDialog(null,"O animal emite um som.");
	    }
	}

