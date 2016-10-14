package imd.enderson.revisao;

public class Gerente extends Funcionario {
	
	private String setor;
	private String senha;
	
	public Gerente(String nome, String matricula, String cpf, String setor, String senha) {
		super(nome, matricula, cpf);
		this.setor = setor;
		this.senha = senha;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
