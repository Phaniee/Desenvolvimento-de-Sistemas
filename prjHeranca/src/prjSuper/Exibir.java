package prjSuper;

public class Exibir {
	 public static void main(String[] args) {
	       
		 Gato gato = new Gato("Batata", "SRD");
	        
		 	gato.emitirSom(); // Chama o m�todo da subclasse
	       
	        gato.mostrarDetalhes(); // Chama um m�todo da subclasse
	    }
	}

