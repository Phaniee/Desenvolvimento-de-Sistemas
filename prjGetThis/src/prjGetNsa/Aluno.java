package prjGetNsa;

public class Aluno {
	//ATRIBUTOS
	private String rm;
 	private String nome;
	private String dataNasc;
	private String cpf;
	private String email;
	
	//CONSTRUTORES
	// um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno -- nem mesmo void.
	public Aluno() {
		
	}
	
	//GETTERS E SETTERS
	public void setRmAluno(String rm) {
		this.rm = rm;
	}
	public void setNomeAluno(String nome) {
			this.nome = nome;
	}
	public void setDataNascAluno(String dataNasc) {
			this.dataNasc = dataNasc;
	}
	public void setCpfAluno(String cpf) {
			this.cpf = cpf;
	}
	public void setEmailAluno(String email) {
			this.email = email;
	}
	

	public String getRmAluno() {
		return rm;
	}
	public String getNomeAluno() {
		return nome;
	}
	public String getDataNascAluno() {
		return dataNasc;
	}
	public String getCpfAluno() {
		return cpf;
	}
	public String getEmailAluno() {
		return email;
	}
}
