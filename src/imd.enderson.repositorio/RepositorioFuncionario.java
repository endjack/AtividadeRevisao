package imd.enderson.revisao.repositorio;

import java.util.ArrayList;
import imd.enderson.revisao.*;

public class RepositorioFuncionario implements IRepositorio {
	
	private Repositorio bancoFunc = new Repositorio();
	
	private ArrayList<Funcionario> bancoDados() {
		return bancoFunc.getBanco();
	}
	
	@Override
	public void inserirFuncionario(Funcionario f) {
		bancoDados().add(f);
	}

	@Override
	public void deletarFuncionario(String matricula) {
		for(Funcionario f :bancoDados()){
			if(f.getMatricula().equals(matricula)){
				bancoDados().remove(f);
			}
		}
	}
	@Override
	public void atualizarFuncionario(String matricula, String cpf) {
		for(Funcionario f :bancoDados()){
			if(f.getMatricula().equals(matricula)){
				f.setCpf(cpf);
			}
		}
	}

	@Override
	public Funcionario buscarFuncionario(String matricula) {
		for(Funcionario f :bancoDados()){
			if(f.getMatricula().equals(matricula)){
				return f;
			}
		}
		return null;
	}

	@Override
	public void listarFuncionarios() {
		for(Funcionario f :bancoDados()){
			System.out.println("Nome: "+ f.getNome());
			System.out.println("Matricula: "+ f.getMatricula());
			System.out.println("CPF: "+ f.getCpf());
			
			if(f instanceof Diretor){
				System.out.println("Setor: "+ ((Gerente)f).getSetor());
			}
			if(f instanceof Gerente){
				System.out.println("Setor: "+ ((Gerente)f).getSetor());
			}	
		}
	}
}
