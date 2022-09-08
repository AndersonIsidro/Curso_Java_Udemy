package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
	
	List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
	
	System.out.println("Forma Tradicional...");
	for(String nome: aprovados) {
		System.out.println(nome);
	}
	
	// significa que use foreach para que para cada nome da lista imprimir no console
	//a expressao ao lado ou seja o nome mais !!! para cada item do array
	System.out.println("\nLambda na versão 1...");
	aprovados.forEach((nome)->{System.out.println(nome+"!!!");});
	
	//mesmo metodo acima mais simplificado e sem possibilidade de concatenar !!
	System.out.println("\nMethod Reference...");
	aprovados.forEach(System.out::println);
	
	//esse é um lambda possivel adicionar uma string que 
	//estiver fora do metodo main ou em outra classe
	System.out.println("\nLambda na versão 2...");
	aprovados.forEach((nome)->{meuImprimir(nome);});
	
	//mesmo metodo acima method acima com possibilidade de concatenar com string externa da classe !!
	System.out.println("\nMethod Reference 2...");
	aprovados.forEach(Foreach::meuImprimir);
	
	}
	static void meuImprimir(String nome) {
		System.out.println("Oi!Meu nome é "+nome);
	}
}
