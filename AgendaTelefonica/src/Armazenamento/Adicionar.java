package Armazenamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Adicionar {
	
	private ArrayList<Pessoa> agenda;
	

	public Adicionar(){
		agenda = new ArrayList<Pessoa>();
	}
	
	public void addPessoa(Pessoa pessoa){
		agenda.add(pessoa);
	}

	public ArrayList<Pessoa> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Pessoa> agenda) {
		this.agenda = agenda;
	}
	
	//TODO 
	/* CRIAR UM METODO SORTING PARA GUARDAR TODAS PESSOAS DA AGENDA EM ORDEM ALFAB�TICA
	 * ASSIM PODEREMOS USAR O LISTAR E ELE RETORNAR� EM ORDEM ALFAB�TICA*/
	
	
}
