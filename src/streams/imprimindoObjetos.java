package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu","Ana","Gui","Luca");
		
		System.out.println("\nUsando forEach");
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iterator");
		Iterator<String> it = aprovados.iterator();// esta percorrendo o array
		while(it.hasNext()) { //e aqui esta percorrendo exibindo os elementos usando iterator
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream");
		Stream<String> stream= aprovados.stream();
		stream.forEach(System.out::println);
		
		
		
		
		
		
		
	}
	
}
