// Um try sempre exige um catch ou um finally
/*
 * Repare que a conex�o foi fechada automaticamente. Ent�o conclu�mos que essas tr�s linhas do console se 
 * referem aos antigos blocos try e finally. N�o precisamos mais escrever explicitamente o bloco finally,
 * pois o novo try j� nos garante que o recurso que est� sendo aberto dessa forma ser� fechado automaticamente,
 * desde que ele implemente a interface AutoCloseable.
 * 
 */
public class TesteConexao  {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();				
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
	}
}
		
//		//----------------------------
//		Conexao con =null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException e) {
//			System.out.println("Deu erro na conexao");
//		}finally { // esse bloco sempre sera executado, com ou sem erro
//			System.out.println("Finally");
//			if(con !=null) {
//				con.fecha();	
//			}
//		}
	
