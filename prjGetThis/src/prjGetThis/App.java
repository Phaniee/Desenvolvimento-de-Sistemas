package prjGetThis;
import javax.swing.JOptionPane;
public class App {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.setCodTurma(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo da turma: ")));
		
		turma.setNomeTurma(JOptionPane.showInputDialog("Informe o nome da turma:"));

		JOptionPane.showMessageDialog(null, "O c�digo da turma �: "+turma.getcodTurma()+"\nO nome da turma �: "+turma.getnomeTurma());
		
		
	}

}
