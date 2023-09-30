package prjHeranca;

import javax.swing.JOptionPane;

public class Retangulo extends FormaGeometrica {//extends usado para se referir a herança
	
	//Método herdado da classe mãe/superclasse
	//@override termo usado para indicar quando está usando um método herdado
	//garante que você está sobrescrevendo corretamente um método existente da superclasse.
	public double calcularArea() {
		
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a base do retângulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do retângulo:"));
		
		double area = base*altura;
		
		return area;
	}
}
