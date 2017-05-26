package app;

import java.util.Scanner;

import Armazenamento.Adicionar;
import Armazenamento.Pessoa;
import Pesquisa.Listar;
import Pesquisa.Pesquisa;

public class AgendaApp {
	private static Scanner n;
	private static Scanner t;
	private static Scanner p;

	public static void main(String[] args) {
		Adicionar adicionar = new Adicionar();
		

		
		for(int i = 0; i < 5; i++){
			n = new Scanner(System.in);
			t = new Scanner(System.in);
			
			int te = t.nextInt();
			String no = n.nextLine();
			Pessoa pessoa = new Pessoa(no, te);
			adicionar.addPessoa(pessoa);
		}
		Listar listar = new Listar(adicionar);
		listar.listar();
		
		System.out.println("Pesquise um nome para retornar seu telefone:");
		p = new Scanner(System.in);
		String pe = p.nextLine();
		Pesquisa pesquisa = new Pesquisa(adicionar);
		System.out.println(pesquisa.pesquisar(pe));
		
		
		
	}

}
