package prjHeranca;

import javax.swing.JOptionPane;

public class Aplicacao {
	public static void main(String[] args) {
	
		Retangulo retangulo = new Retangulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo ();
		
		String escolha;
		String [ ] resposta = {"Ret�ngulo", "Quadrado","Tri�ngulo"};
		
		escolha = (String) JOptionPane.showInputDialog(null, "Selecione a op��o que deseja calcular a �rea:","Selecione o programa a executar", 
				JOptionPane.QUESTION_MESSAGE,null,resposta,resposta[0]);
		
		switch (escolha) {
			case "Ret�ngulo": 
			JOptionPane.showMessageDialog(null,retangulo.calcularArea());
			break;
			case "Quadrado":
				JOptionPane.showMessageDialog(null,quadrado.calcularArea());
				break;
			case "Tri�ngulo":
				JOptionPane.showMessageDialog(null,triangulo.calcularArea());
				break;
		default:
			JOptionPane.showMessageDialog(null,"op��o inv�lida.");
		}
	}
}


