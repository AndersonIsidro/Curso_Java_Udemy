package fundamentos.operadores;

public class logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);

		// tabela verdade E ou && - SOMENTE QUANDO TODOS RESULTADOS SAO VERDADEIROS
		System.out.println("tabela verdade E - AND");
		System.out.println(true && true);
		System.out.println(true && false);
		// System.out.println(false && true);
		System.out.println(true && true);
		System.out.println(true && false);

		// tabela verdade OU - OR - QUANDO UM DOS RESULTADOS FOREM VERDADEIROS
		System.out.println("tabela verdade OU - OR");
		// System.out.println(true || true);
		// System.out.println(true || false);
		System.out.println(false || true);
		// System.out.println(true || true);
		// System.out.println(true || false);

		// tabela verdade OU EXCLUSIVO - XOR - QUANDO UM DOS RESULTADOS EXCLUSIVOS FOREM
		// VERDADEIROS
		System.out.println("tabela verdade OU EXLUSIVO - XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(true ^ true);
		System.out.println(true ^ false);

		// tabela verdade NOT - !- INVERTE OU NEGA O RESULTADO QUANDO FOR VERDADEIRO
		System.out.println("tabela verdade NOT - ! - !!");
		System.out.println(! true);
		System.out.println(! false);
		
	}
}
