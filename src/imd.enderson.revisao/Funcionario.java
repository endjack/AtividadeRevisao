package imd.enderson.revisao;

public class Funcionario {
	
	private String nome;
	private String matricula;
	private String cpf;
	
	public Funcionario(String nome, String matricula, String cpf) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCpf(cpf);
	}
	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
