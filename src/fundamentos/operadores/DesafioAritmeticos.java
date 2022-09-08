package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = 3 * 4 -10;
		int b = (int) Math.pow(a, 3); // para calcular algo elevado ao quadrado usar esta formula math.pow ( a segunda é a elevação)
		
		System.out.println(b);
		//                 2               2  )3
		//DESAFIO ([6*(3+2)}   - (1-5)*(2-7)  )
		//           /3*2             2       )
		//          dividido po 10 elevado a 3
		
		
		//primeira parte desafio
		int c = 3+2;
		int d = 6*c;
		int h = (int) Math.pow(d, 2);
		int e = 3*2;
		int f = h/e;
		System.out.println(f);
		
		//segunda parte desafio
		int i = 1-5;
		int j = 2-7;
		int l = i*j;
		int m = l/2;
		int n=(int) Math.pow(m, 2);
		System.out.println(n);
		
		//TERCEIRA PARTE
		int o = f-n;
		int p = (int) Math.pow(o, 3);
		int q = 10;
		int r = (int) Math.pow(q, 3);
		
		//RESULTADO
		System.out.println(p/r);
		
		//correção;
		
		double numA = Math.pow(6*(3+2),2);
		double denA = 3*2;
		
		double numB = (1-5)*(2-7);
		double denB = 2;
		
		double superiorA = numA/ denA;
		double superiorB = Math.pow(numB/denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		System.out.println("O resultado >"+ resultado);
		
				
		
		
		
		
				
		
		
		
		
				
	}

}
