package prjHeranca;

import javax.swing.JOptionPane;

public class Quadrado extends FormaGeometrica{
	
	//M�todo herdado da classe m�e
	public double calcularArea() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o lado do quadrado:"));
		//forma usada para fazer lado elevado ao quadrado
		double area = Math.pow(lado, 2);
		
		return area;
	}
}

