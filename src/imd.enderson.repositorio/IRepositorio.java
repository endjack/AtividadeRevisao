package imd.enderson.revisao.repositorio;

import imd.enderson.revisao.Funcionario;

public interface IRepositorio {
	void inserirFuncionario(Funcionario f);
	void deletarFuncionario(String matricula);
	void atualizarFuncionario(String matricula, String cpf);
	Funcionario buscarFuncionario(String matricula);
	void listarFuncionarios();
}
