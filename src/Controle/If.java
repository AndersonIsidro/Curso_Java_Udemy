package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a Média: ");
		
		double media = entrada.nextDouble();
		
		if(media <= 10 && media>= 7.0) {
			System.out.println("Aprovado!"); //mesma sentença para dar resulktado somente quando verdadeiro 
		    System.out.println("Parabens!"); //para usar um bloco de codigo para mesma sentença utilizar { }
		}
		
		if(media<=7 && media>=5)
			System.out.println("Recupeção!");
		if(media<=4.9)
			System.out.println("Reprovado");
		
		
		
		entrada.close();
	}

}
