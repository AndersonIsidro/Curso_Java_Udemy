package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(a != b); // diferente !=
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 6;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem Desconto " +temDesconto);
		
		
				
	
		
		
		
		
		
	}

}
