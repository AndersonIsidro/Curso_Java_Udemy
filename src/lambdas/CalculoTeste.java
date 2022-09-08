package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo soma = new Somar();
		Calculo multiplicacao = new Multiplicar();
		Calculo subtracao= new Subtrair();
		System.out.println(soma.executar(5, 6));
		System.out.println(multiplicacao.executar(5, 6));
		System.out.println(subtracao.executar(5, 6));
	}

}
