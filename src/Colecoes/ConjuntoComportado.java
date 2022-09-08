package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<>();//HashSet nao mostra na ordem de seção
		Set<String> listaAprovados = new TreeSet<>();//TreeSetmostra na ordem de seção
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
	
		
		for(String candidatos : listaAprovados){
			System.out.println(candidatos);
		}
		
		Set<Integer> nums= new HashSet<>();//TreeSetmostra na ordem de seção
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n : nums) {
			System.out.println(n);
		}
		
		
		
		
	}

}
