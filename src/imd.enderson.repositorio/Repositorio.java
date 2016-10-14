package imd.enderson.revisao.repositorio;
import java.util.ArrayList;
import imd.enderson.revisao.*;

public class Repositorio {
	
	private ArrayList<Funcionario> banco;

	public Repositorio() {
		this.banco = new ArrayList<Funcionario>();
	}

	public ArrayList<Funcionario> getBanco() {
		return this.banco;
	}

	public void setBanco(ArrayList<Funcionario> banco) {
		this.banco = banco;
	}
	
	
	
}
