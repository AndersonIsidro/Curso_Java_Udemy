package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		//desta forma a ultima informação é a primeira a ser exibida como em uma pilha de livros
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe"); // add retorna v ou f
		livros.push("Don Quixote"); // . push adiciona nao retorna 
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // mostra os elementos conforme a pilha
		System.out.println(livros.element());
		
		System.out.println(livros.poll()); // retira o elemnto da lista conforme a pilha
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		
		
	}

}
