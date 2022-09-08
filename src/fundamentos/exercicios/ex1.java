package fundamentos.exercicios;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/** 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("Valor em Farenheit: " + (int)conversao);
		
		scanner.close();
	}

}
