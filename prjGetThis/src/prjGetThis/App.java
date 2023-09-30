package prjGetThis;
import javax.swing.JOptionPane;
public class App {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.setCodTurma(Integer.parseInt(JOptionPane.showInputDialog("Informe o código da turma: ")));
		
		turma.setNomeTurma(JOptionPane.showInputDialog("Informe o nome da turma:"));

		JOptionPane.showMessageDialog(null, "O código da turma é: "+turma.getcodTurma()+"\nO nome da turma é: "+turma.getnomeTurma());
		
		
	}

}
