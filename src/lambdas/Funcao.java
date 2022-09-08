package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		
	
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 ==0? "Par":"Impar";
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> resultadoE =
				valor -> "O resultado é:"+valor;
		
		Function<String, String> empolgado =
						valor -> valor + "!!!";
	
	String resultadoFinal = 
			parOuImpar.andThen(resultadoE).andThen(empolgado).apply(32);
	System.out.println(resultadoFinal);

	}
}
