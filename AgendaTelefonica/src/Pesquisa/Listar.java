package Pesquisa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Armazenamento.Adicionar;
import Armazenamento.Pessoa;

public class Listar {
	private Adicionar agenda;
	private ArrayList<String> nomes;

	public Listar(Adicionar agenda){
		this.agenda = agenda;
	}

	public void listar(){


//		ArrayList<Pessoa> lista = agenda.getAgenda();
//		
//		for(int i = 0; i <lista.size() -1; i++){
//			System.out.println(lista.get(i).getNome());
//		}

				ArrayList<Pessoa> lista = agenda.getAgenda();
				nomes = new ArrayList<String>();
				for(int i = 0; i < lista.size(); i++){
					nomes.add(lista.get(i).getNome());
					Collections.sort(nomes, new Comparator<String>(){
						@Override
						public int compare(String s1, String s2){
							return s1.compareToIgnoreCase(s2);
						}
					});
					
				}
				for(int i = 0; i< nomes.size(); i++){
					System.out.println(nomes.get(i));
				}
			}
	}

