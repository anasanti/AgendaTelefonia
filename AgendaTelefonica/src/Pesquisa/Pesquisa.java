package Pesquisa;

import java.util.ArrayList;

import Armazenamento.*;

public class Pesquisa {
	
	private Adicionar agenda;
	
	public Pesquisa(Adicionar agenda){
		this.agenda = agenda;
	}
	
	public int pesquisar(String nome){
		
		int telefone = 0;
		
		ArrayList<Pessoa> lista = agenda.getAgenda();
				
		for(int i = 0; i < lista.size() - 1; i++){
			Pessoa pessoa = lista.get(i);
			
			if(pessoa.getNome() == nome){
				telefone = pessoa.getTelefone();
			}
		}
		return telefone;
	}
	
}
