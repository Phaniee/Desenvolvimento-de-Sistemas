package prjCalculadora;
import javax.swing.JOptionPane;
public class App {
	public static void main(String[] args) {
		
		Calculadora calculo = new Calculadora( );

//		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:"));
//		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:"));
		
		String option;
		String [ ] resposta = {"Soma", "Subtração","Multiplicação","Divisão","Soma Reais","Subtrair Reais"};
		
		option = (String) JOptionPane.showInputDialog(null, "Selecione a opção:","Selecione o programa a executar", 
				JOptionPane.QUESTION_MESSAGE,null,resposta,resposta[0]);
		
		switch (option) {
		case "Soma":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null,calculo.soma(calculo.getN1(),calculo.getN2()));
			break;
		case "Subtração":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.subtrair(calculo.getN1(),calculo.getN2()));
			break;
		case "Multiplicação":
			calculo.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro numero:")));
			calculo.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero:")));
			JOptionPane.showMessageDialog(null, calculo.multiplicar(calculo.getN1(),calculo.getN2()));
			break;
		case "Divisão":
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
			JOptionPane.showMessageDialog(null,"opção inválida.");
		}	
	}
}
