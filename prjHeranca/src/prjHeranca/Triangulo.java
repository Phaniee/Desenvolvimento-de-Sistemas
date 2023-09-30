package prjHeranca;

import javax.swing.JOptionPane;

public class Triangulo extends FormaGeometrica{
	
	//M�todo herdado da classe m�e/superclasse
	public double calcularArea() {
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a base do tri�ngulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do tri�ngulo:"));
		
		double area = base*altura/2;
				
		return area;
	}
	public void formaTriangulo() {
		double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro lado do tri�ngulo:"));
		double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo lado do tri�ngulo:"));
		double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo lado do tri�ngulo:"));
		
		//verificando ou n�o se � um triangulo
				if ((ladoA>ladoB+ladoC)|| (ladoB>ladoA+ladoC) || (ladoC>ladoA+ladoB) ) {
				System.out.println("As medidas n�o formam um tri�ngulo.");
				
				}else if (ladoA==ladoB && ladoB==ladoC) {
					System.out.println("Tri�ngulo Equilatero");
				}else if (ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC) {
					System.out.println("Tri�ngulo Escaleno.");
				}else {
					System.out.println("Tri�ngulo Is�celes.");
		}
	}
}
