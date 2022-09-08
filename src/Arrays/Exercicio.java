package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9; //a base que fica dentro do array sempre começa do indice 0
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA)); // usa assim para imprimir todo indice do array
		System.out.println(notasAlunoA[0]);//assim para imprimir um certo indice dentro do array
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // USA ASSIM PARA IMPRIMIR O ULTIMO INDICE DO ARRAY
		//System.out.println(notasAlunoA[4]); nao se pode usar assim pq o array citado tem apenas 0 a 3 indices
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
			
		}		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9 ,8.9, notaArmazenada, 10, 8};//para compor o array pode ser o numero ou a variavel escolhida
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			double d = notasAlunoB[i];
		}
		System.out.println(Arrays.toString(notasAlunoB)); // usa assim para imprimir todo indice do array
		
		
		
		
	}

}
