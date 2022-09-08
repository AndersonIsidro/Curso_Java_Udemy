package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		//calcular preco real
		double a = 1-p.desconto;
		double precoComDesconto = p.preco * a ;
		
		if(precoComDesconto >= 2500.0) {
			precoComDesconto = precoComDesconto + 239;
		}else {
			System.out.println("Isento");
		}
		if(precoComDesconto > 3000) {
			precoComDesconto = precoComDesconto + 100;
		}else {
			precoComDesconto = precoComDesconto + 50;
		}
		
		System.out.printf("O valor real do produto é:R$%.2f\n",precoComDesconto);
		
		
		
		
		//correção com lambda expression
		Function<Produto,Double>precoFinal = prod -> prod.preco*(1-prod.desconto);
		UnaryOperator<Double>impostoMunicipal = preco -> preco >= 2500 ? preco *1.085: preco;
		UnaryOperator<Double>frete= preco -> preco >= 3000 ? preco + 100: preco + 50;
		UnaryOperator<Double>arredondar= preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double,String>formatar = preco -> ("R$"+preco).replace(".",",");
		
		Produto p1 = new Produto("Ipad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar).apply(p1);
		System.out.println("O preco na correcao"+preco);		
		
		
	}

}
