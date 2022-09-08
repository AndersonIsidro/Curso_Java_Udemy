package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ","AUDI ","HONDA ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		
	}

}
