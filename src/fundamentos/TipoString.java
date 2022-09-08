package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(8));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		System.out.println("Nome:" + nome + "\nSobrenome:" + sobrenome + "\nIdade:" + idade + "\nsalario:" + salario);
		String frase = String.format("o senhor pedro santos tem 33 anos");
		System.out.println(frase);
		System.out.println("Frase qualquer".contains("qual"));
		

	}
}
