package prjCalculadora;
import javax.swing.JOptionPane;
public class App {
	public static void main(String[] args) {
		
		Calculadora calculo = new Calculadora( );

//		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:"));
//		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:"));
		
		String option;
		String [ ] resposta = {"Soma", "Subtra��o","Multiplica��o","Divis�o","Soma Reais","Subtrair Reais"};
		
		option = (String) JOptionPane.showInputDialog(null, "Selecione a op��o:","Selecione o programa a executar", 
				JOptionPane.QUESTION_MESSAGE,null,resposta,resposta[0]);
		
		switch (option) {
		case "Soma":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null,calculo.soma(calculo.getN1(),calculo.getN2()));
			break;
		case "Subtra��o":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.subtrair(calculo.getN1(),calculo.getN2()));
			break;
		case "Multiplica��o":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.multiplicar(calculo.getN1(),calculo.getN2()));
			break;
		case "Divis�o":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.dividir(calculo.getN1(),calculo.getN2()));
			break;
		case "Soma Reais":
			calculo.setN3(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN4(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.soma(calculo.getN3(),calculo.getN4()));
			break;
		case "Subtrair Reais":
			calculo.setN3(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN4(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.subtrair(calculo.getN3(),calculo.getN4()));
		default:
			JOptionPane.showMessageDialog(null,"op��o inv�lida.");
		}	
	}
}
