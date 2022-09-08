package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadenotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1) {
			System.out.printf("Informe a nota ou -1 pra sair");
			nota = entrada.nextDouble();
			
			if(nota<= 10 && nota >=0) {
			total += nota;
			quantidadenotas++;
		} else if(nota !=-1){
			System.out.println("Nota Invalida");
		}
		//calcular a media
		double media = total / quantidadenotas;
		System.out.println("Média = " + media);
		
		entrada.close();
	
		}
		
	}
}