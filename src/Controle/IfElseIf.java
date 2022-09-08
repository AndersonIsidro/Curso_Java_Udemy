package Controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota> 10 || nota <0)
			System.out.println("Nota invalida"); // estrutura if else apenas um bloco sera executado
		else if(nota >= 8.1)      {        //inserir if -se esta nota ou condição estiver dentro de else ele mostra a msg sugerida
			System.out.println("Nota A");
		    System.out.println("Voce Passou!Parabens!");
		}
		else if (nota>=6.1)
			System.out.println("nota B");
		else if(nota>=4.1)
			System.out.println("nota C");
		else if (nota>=0.1) {
			System.out.println("Nota D");
		    System.out.println("Reprovado!");
		}
		
		
		
		
		
		
		entrada.close();
		
		
		
		
	}

}
