package prjSuper;

public class Exibir {
	 public static void main(String[] args) {
	       
		 Gato gato = new Gato("Batata", "SRD");
	        
		 	gato.emitirSom(); // Chama o método da subclasse
	       
	        gato.mostrarDetalhes(); // Chama um método da subclasse
	    }
	}

