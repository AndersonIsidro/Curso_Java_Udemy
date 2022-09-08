package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criandoStreams {
	public static void main(String[] args) {
		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ","Lua ","JS\n");
		langs.forEach(print);		//utilizando da forma literal
		
		String[] maisLangs = {"Python ","Lisp ","Perl ","Go\n"};	
		Stream.of(maisLangs).forEach(print); //utilizando com array
		
		Arrays.stream(maisLangs).forEach(print); //utilizando e declarando direto no array
		Arrays.stream(maisLangs, 1, 3).forEach(print); //utilizando e declarando direto no array vai pegar do indice 1 ao 4 sem mostrar o 3
		
		List<String> outrasLangs =Arrays.asList("C ","PHP ","KOTLIN \n");
		outrasLangs.stream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print); - desta forma gera uma stream infinita
		//Stream.iterate(0,n -> n+1).forEach(print); -gera indefinidamente ate que pare o programa
		
		
	}

}
