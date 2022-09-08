package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String Primeiro = "";
		
		
		while(!Primeiro.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
		    Primeiro = entrada.nextLine();
		
		}
		entrada.close();
		
	}

}
