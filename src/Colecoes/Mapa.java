package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		
		Map<Integer,String> usuarios = new HashMap<>(); //(Integer é a chave e String os valores
		
		usuarios.put(1,  "Roberto"); // .put ele adiciona o elemento e substitui caso haja um mesmo elemento ja adiconado
		usuarios.put(2,  "Ricardo");
		usuarios.put(3,  "Rafaela");
		usuarios.put(4,  "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());// imprime valor da chave
		System.out.println(usuarios.values());// imprime conteudo do valor
		System.out.println(usuarios.entrySet());// imprime chave e valor junto
		
		System.out.println(usuarios.containsKey(1));// para saber se contem a chave consultada retorna v ou f
		System.out.println(usuarios.containsValue("Rebeca"));// para saber se contem o valor consultado retorna v ou f
		
		System.out.println(usuarios.get(3));// pega o valor dentro da chave selecionada
		System.out.println(usuarios.remove(3, "Rebeca"));
		
		//laço for para percorrer as chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		//laço for para percorrer os valores
		for(String valores: usuarios.values()) {
			System.out.println(valores);
		}
		//laço for para percorrer chave e valor junto
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.print(registro.getValue()+ "\n");
			
		}
		
		
		
		
	}

}
