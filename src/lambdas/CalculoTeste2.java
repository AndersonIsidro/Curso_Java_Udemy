package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
	//neste caso a funcao lambda reconhece a funcao que esta feita na interface e posso alterar
		//os dados contidos nessa interface dentro dessa classe que estou
	Calculo calc = (x,y) -> {return x+y;};
	System.out.println(calc.executar(5,6));
	//isso faz exatamento como no exemplo acima
	calc = (x,y) -> x * y;
	System.out.println(calc.executar(5,6));

	}
}
