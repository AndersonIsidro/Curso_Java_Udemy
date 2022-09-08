package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/// informaçoes de funcionario

		// tipos numericos inteiros
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long PontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas= 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;	//true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(AnosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(NumeroDeVoos /2);
		
		//Pontos por real
		System.out.println(PontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -->"+ salario);
		System.out.println("Ferias?" + estaDeFerias);
		System.out.println("Status:"+status);
	

	}
}
