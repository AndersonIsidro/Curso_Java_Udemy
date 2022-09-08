package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		//isso é uma logica de que todo produto é considerado caro se valer mais que 750 mesmo c desconto
		Predicate<Produto> isCaro = prod -> (prod.preco *(1 - prod.desconto)) >= 750;
		Produto produto = new Produto("Notebook",3896.89,0.15);
		System.out.println(isCaro.test(produto));
		
	}

}
