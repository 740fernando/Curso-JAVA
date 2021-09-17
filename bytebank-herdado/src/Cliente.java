// quando vc utiliza a interface, � necess�rio usar o "implements" + "Nome da interface"
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador= new AutenticacaoUtil();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}



