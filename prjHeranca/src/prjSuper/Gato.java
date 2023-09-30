package prjSuper;
import javax.swing.JOptionPane;

public class Gato extends Animal {
	 protected String raca;

	    public Gato(String nome, String raca) {
	        super(nome); // Chamando o construtor da superclasse para inicializar o nome
	        this.raca = raca;
	    }
	    //herança da superclasse
	    public void emitirSom() {
	       JOptionPane.showMessageDialog(null,"O gato mia!");
	    }

	    public void mostrarDetalhes() {//metodo novo criado apenas na subclasse
	        JOptionPane.showInternalMessageDialog(null, "Nome: " + nome);
	        JOptionPane.showInternalMessageDialog(null,"Raça: " + raca);
	    }
	}


