package Pesquisa;

import java.util.ArrayList;

import Armazenamento.*;

public class Pesquisa {
	
	private Adicionar agenda;
	
	public Pesquisa(Adicionar agenda){
		this.agenda = agenda;
	}
	
	public int pesquisar(String nome){
		
		ArrayList<Pessoa> lista = agenda.getAgenda();
				
		for(int i = 0; i < lista.size() - 1; i++){
			
		}
		return 0;
	}
	
}
