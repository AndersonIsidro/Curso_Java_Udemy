package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9 ,8.9, notaArmazenada, 10, 8};//para compor o array pode ser o numero ou a variavel escolhida
		
		double totalAlunoB = 0;
		for (double notaAluno: notasAlunoB) { //foreach
			System.out.print(notaAluno + " ");
		}
	}

}
