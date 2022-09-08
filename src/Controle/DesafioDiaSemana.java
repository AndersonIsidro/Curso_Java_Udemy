package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		//domingo 1 segunda 2 terca 3 quarta 4 quinta 5 sexta 6 sabado 7
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("Digite o dia escolhido\n");
		String primeiro = entrada.next();
		
		
		if(primeiro.equalsIgnoreCase("domingo"))
			System.out.println(1);
		else if (primeiro.equalsIgnoreCase("segunda") )
			System.out.println(2);
		else if (primeiro.equalsIgnoreCase("terça" ))
			System.out.println(3);
		else if (primeiro.equalsIgnoreCase("quarta"))
			System.out.println(4);
		else if (primeiro.equalsIgnoreCase("quinta"))
			System.out.println(5);
		else if(primeiro.equalsIgnoreCase("sexta"))
			System.out.println(6);
		else if (primeiro.equalsIgnoreCase("sabado"))
			System.out.println(7);
		else
		System.out.println("Dia Invalido!");
		
		
		
		entrada.close();
		
		
	}

}
