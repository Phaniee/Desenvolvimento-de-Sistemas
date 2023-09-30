package prjSuperAluno;

import javax.swing.JOptionPane;

public class Exibir {
	public static void main(String[] args) {
		
		Aluno a = new Aluno ("Ste","17458", "521.478.523-2", "29/01/1999");
		
		JOptionPane.showMessageDialog(null,"Nome: "+ a.nome+"\nRM: "+a.rm+"\nCPF: "+a.cpf+"\nData Nascimento:"+a.dataNasc );
		
		
	}
}
