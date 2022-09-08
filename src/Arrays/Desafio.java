package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notas  = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a Nota: " + (i + 1) + " ");
			notas[i]= entrada.nextDouble();
			
		}
		double total = 0;
				for(double nota: notas) { // foreach
					total += nota;
				}
		
		double media = total / notas.length;		
		System.out.println("A media é " + media + " ! ");		
		entrada.close();
	}


}
