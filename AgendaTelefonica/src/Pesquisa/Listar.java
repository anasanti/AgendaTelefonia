package Pesquisa;

import java.util.ArrayList;

import Armazenamento.Adicionar;
import Armazenamento.Pessoa;

public class Listar {
	private Adicionar agenda;
	
	public Listar(Adicionar agenda){
		this.agenda = agenda;
	}
	
	public void listar(){
		
		ArrayList<Pessoa> lista = agenda.getAgenda();
		
		for(int i = 0; i < lista.size() - 1; i++){
			Pessoa pessoa = lista.get(i);
			
		}
	}
}
