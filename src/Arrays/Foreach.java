package Arrays;

public class Foreach {
public static void main(String[] args) {
	double[] notas = {9.9, 8.7, 7.2, 9.4};
	
	for(double nota: notas) { //metodo foreach que faz um for com controle de laço mais facil
		System.out.print(nota + " ");
	}
}
}
