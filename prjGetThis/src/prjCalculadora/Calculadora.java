package prjCalculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	private int n1,n2;
	private double n3,n4;
	
	//GETTERS e SETTERS
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}

	//para simular uma sobrecarga de metodo você repete o mesmo nome porem muda o retorno e parametros
	public int soma (int n1, int n2) {
		
		return n1+n2;
	}
	public double soma (double n3,double n4) {
		
		return n3+n4;
	}
	public int subtrair (int n1,int n2) {
		
		return n1 - n2;
	}
	public double subtrair (double n3,double n4) {
		
		return n3 - n4;
	}

	public int multiplicar (int n1, int n2) {
		
		return n1*n2;
	}
	public String dividir (int n1,int n2) {
		
		String resultadoFinal="";
		
		if(n2==0) {
			JOptionPane.showMessageDialog(null, "Não é possivel dividir por zero");
			resultadoFinal= "0";
		}else {
			 resultadoFinal += (n1/n2);	
		}
		return resultadoFinal;
		
	}
}
