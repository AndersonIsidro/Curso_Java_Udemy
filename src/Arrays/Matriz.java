package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Quantos alunos tem na turma ");
		int qntdeAlunos = entrada.nextInt();		
		
		System.out.print("Quantas Notas os alunos tem ");
		int qntdeNotas = entrada.nextInt();
		
		double[][] notas  = new double[qntdeAlunos][qntdeNotas];
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d. ", j + 1, i + 1);
				notas[i] [j] = entrada.nextDouble();			
				total += notas[i][j];}
		}
				
		double media = total / (qntdeAlunos * qntdeNotas);		
		System.out.println("A media dos alunos é " + media + " ! ");
		
		for (double[] notasDoAluno: notas) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		entrada.close();
		
	}
}
