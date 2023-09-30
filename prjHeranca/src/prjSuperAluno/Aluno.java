package prjSuperAluno;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
	protected String rm;
	

	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public Aluno(String nome, String rm, String cpf, String dataNasc) {
		super(nome, cpf, dataNasc);
		this.rm = rm;
	}
	public void exibir () {
		JOptionPane.showMessageDialog(null, rm);
	}
}
