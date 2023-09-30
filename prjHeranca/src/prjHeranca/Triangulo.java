package prjHeranca;

import javax.swing.JOptionPane;

public class Triangulo extends FormaGeometrica{
	
	//Método herdado da classe mãe/superclasse
	public double calcularArea() {
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a base do triângulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura do triângulo:"));
		
		double area = base*altura/2;
				
		return area;
	}
	public void formaTriangulo() {
		double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro lado do triângulo:"));
		double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo lado do triângulo:"));
		double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo lado do triângulo:"));
		
		//verificando ou não se é um triangulo
				if ((ladoA>ladoB+ladoC)|| (ladoB>ladoA+ladoC) || (ladoC>ladoA+ladoB) ) {
				System.out.println("As medidas não formam um triângulo.");
				
				}else if (ladoA==ladoB && ladoB==ladoC) {
					System.out.println("Triângulo Equilatero");
				}else if (ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC) {
					System.out.println("Triângulo Escaleno.");
				}else {
					System.out.println("Triângulo Isóceles.");
		}
	}
}
