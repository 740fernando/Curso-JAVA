
public class FluxoComTratamento {
	//DUPLO CLIQUE NA LINHA PARA HABILITAR O DEBUG
	//F6- DEBUG MACRO
	//F5- DEBUG MICRO
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch(ArithmeticException | NullPointerException | MinhaException e) { // comando pipe (|) == OR 
			//System.out.println(e.getMessage());
			String msg = e.getMessage();
			System.out.println("Exception "+msg);
			e.printStackTrace();// Exibe o rastro da chamada do metodo
		}
		System.out.println("Fim do main");
	}


	private static void metodo1()throws MinhaException {
		System.out.println("Ini do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaException {

		System.out.println("Ini do metodo2");
		throw new MinhaException("Deu muito errado"); //Throw- Joga a excess�o ex na pilha de execu��o, soh funciona com excessoes
		//System.out.println("Fim do metodo2");
	}
}

