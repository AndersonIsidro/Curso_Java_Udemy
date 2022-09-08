package Colecoes;

import java.util.ArrayList;
//exercicio vinculado ao objeto usuario

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario ("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(0)); // forma de percorrer item da lista pelo indice
		
		System.out.println(">>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem este ? " +lista.contains(new Usuario("Lia")));
		
		
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		
		
		
		
	}

}
