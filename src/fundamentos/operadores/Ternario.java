package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 8.6;
		String resultadofinal = media >= 7.0 ? "aprovado" : "reprovado";
		System.out.println("O aluno esta "+ resultadofinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 6;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "\nNão";

		
		System.out.println("Tem Desconto? " + resultado);
		
		
		
		
		
	}

}
