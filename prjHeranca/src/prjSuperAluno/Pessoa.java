package prjSuperAluno;

import javax.swing.JOptionPane;

public class Pessoa {
	protected String nome;
	protected String dataNasc;
	protected String cpf;
	//construtor
	public Pessoa (String nome, String cpf, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void exibir () {
		JOptionPane.showMessageDialog(null, nome);
	}
}


