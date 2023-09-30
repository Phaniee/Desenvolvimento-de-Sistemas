package prjHeranca;

import javax.swing.JOptionPane;

public class Retangulo extends FormaGeometrica {//extends usado para se referir a heran�a
	
	//M�todo herdado da classe m�e/superclasse
	//@override termo usado para indicar quando est� usando um m�todo herdado
	//garante que voc� est� sobrescrevendo corretamente um m�todo existente da superclasse.
	public double calcularArea() {
		
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a base do ret�ngulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do ret�ngulo:"));
		
		double area = base*altura;
		
		return area;
	}
}
