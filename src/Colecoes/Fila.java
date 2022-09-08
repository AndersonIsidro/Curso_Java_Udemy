package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add => adicionam elementos a fila
		//Diferença é o comportamento quando a fila esta cheia
		fila.add("Ana"); // retorna v ou f
		fila.offer("Bia");  // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Diferença é o comportamento quando a fila esta vazia
		System.out.println(fila.peek()); // .peek serve para obter oprimeiro ou proximo elemento da fila (retorna null
		System.out.println(fila.peek());  //ambos sem remover elemento da fila
		System.out.println(fila.element()); // .element serve para obter o primeiro ou proximo elemento da fila (lança uma exceção
		System.out.println(fila.element()); 
		
		//fila.size() para saber o tamanho
		//fila.clear() para limpar a fila
		//fila.isEmpty() saber se a fila esta ou nao vazia
		//fila.contains(...) saber se o elemento entre parenteses esta contido na fila 
		
		System.out.println(fila.poll());//retorna o proximo da fila ja removendo se nao ouver lista retorna null
		System.out.println(fila.remove()); //retorna o proximo da fila ja removendo se nao ouver lista retorna nada
		System.out.println(fila.poll()); 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}
