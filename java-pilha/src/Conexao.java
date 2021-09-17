/*
 * O AutoCloseable exige que tenhamos o m�todo close(), mas podemos deixar o m�todo menos perigoso, retirando o throws Exception. 
 * Assim, simplificaremos um pouco o c�digo e n�o ser� necess�rio mais um tratamento de erro para quem faz a chamada.
*/
public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conexao");
		//throw new IllegalStateException();
	}
	public void leDados() {
		System.out.println("Recebendo dados");
		//throw new IllegalStateException(); // objeto de inconsistencia
	}
	@Override
	public void close() { // Utiliza�ao obrigatoria para fechar as excecoes
		System.out.println("Fechando conexao");	
	}	
}
