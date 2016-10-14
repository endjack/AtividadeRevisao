package imd.enderson.revisao;

import java.util.ArrayList;

import imd.enderson.revisao.repositorio.RepositorioFuncionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente("Enderson","OKI4548","064.289.895-45","Setor1","125968");
		RepositorioFuncionario repositorio = new RepositorioFuncionario();
		
		repositorio.inserirFuncionario(f1);
		repositorio.listarFuncionarios();
		

	}
	public static void listarFuncionarios(ArrayList<Funcionario> banco) {
		for(Funcionario f :banco){
				System.out.println("Nome: "+ f.getNome());
				System.out.println("Matricula: "+ f.getMatricula());
				System.out.println("CPF: "+ f.getCpf());
				System.out.println("\t----------//----------");
		}
		
	}
	public static void listarGerentes(ArrayList<Funcionario> banco){
		for(Funcionario f :banco){
			if(f instanceof Gerente){
				System.out.println("Nome: "+ f.getNome());
				System.out.println("Matricula: "+ f.getMatricula());
				System.out.println("CPF: "+ f.getCpf());		
				System.out.println("Nome: "+ ((Gerente)f).getSetor());
				System.out.println("\t----------//----------");
				}	
		}
		
	}
	public static void listarAuxiliarAdministrativo(ArrayList<Funcionario> banco){
		
	}
	public static void imprimirTodosNomesSetor(ArrayList<Funcionario> banco){
		
	}
}
