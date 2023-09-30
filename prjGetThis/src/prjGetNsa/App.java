package prjGetNsa;
import javax.swing.JOptionPane;
public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setRmAluno(JOptionPane.showInputDialog("Insira o RM do aluno:"));
	
		aluno.setNomeAluno(JOptionPane.showInputDialog("Insira o nome do aluno:"));

		 aluno.setCpfAluno(JOptionPane.showInputDialog("Insira cpf do aluno: "));

		aluno.setDataNascAluno(JOptionPane.showInputDialog("Insira a data de nascimento do aluno:"));

		aluno.setEmailAluno(JOptionPane.showInputDialog("Insira o E-mail do aluno:"));

		//para apresentar as mensagens em apenas um quadrado
		JOptionPane.showMessageDialog(null,"RM: "+aluno.getRmAluno()+"\nNome: "+aluno.getNomeAluno()+ "\nCpf:"+aluno.getCpfAluno()+"\nData de Nascimento: "+aluno.getDataNascAluno()+"\nE-mail: "+aluno.getEmailAluno());
	}

}