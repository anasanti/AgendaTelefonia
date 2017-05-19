package Armazenamento;

import java.util.ArrayList;

public class Adicionar {
	
	private ArrayList<Pessoa> agenda;
	
	public Adicionar(){
		agenda = new ArrayList<Pessoa>();
	}
	
	public void addPessoa(Pessoa pessoa){
		agenda.add(pessoa);
	}
	
}
