package Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // hashset nao aceita primitico por isso ele converte ex :double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add("x");
		
		System.out.println("Tamanho do elemento:"+ conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add("x");
		System.out.println("Tamanho do elemento:"+ conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));//metodo para remover variavel no hashset
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("x"));
		
		System.out.println("Tamanho do elemento:"+ conjunto.size());
		
		System.out.println(conjunto.contains("x"));//para saber se existe essa variavel no conjunto
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // faz a uniao dos dois conjuntos
		conjunto.retainAll(nums);//mostra apenas os valores em comum entre os conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();//para limpar os conjuntos
		System.out.println(conjunto);
		
	}

}
