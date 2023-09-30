package prjHeranca;

import javax.swing.JOptionPane;

public class Aplicacao {
	public static void main(String[] args) {
	
		Retangulo retangulo = new Retangulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo ();
		
		String escolha;
		String [ ] resposta = {"Retângulo", "Quadrado","Triângulo"};
		
		escolha = (String) JOptionPane.showInputDialog(null, "Selecione a opção que deseja calcular a área:","Selecione o programa a executar", 
				JOptionPane.QUESTION_MESSAGE,null,resposta,resposta[0]);
		
		switch (escolha) {
			case "Retângulo": 
			JOptionPane.showMessageDialog(null,retangulo.calcularArea());
			break;
			case "Quadrado":
				JOptionPane.showMessageDialog(null,quadrado.calcularArea());
				break;
			case "Triângulo":
				JOptionPane.showMessageDialog(null,triangulo.calcularArea());
				break;
		default:
			JOptionPane.showMessageDialog(null,"opção inválida.");
		}
	}
}


