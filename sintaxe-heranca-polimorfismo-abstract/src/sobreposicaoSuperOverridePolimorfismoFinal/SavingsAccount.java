package sobreposicaoSuperOverridePolimorfismoFinal;
/*
 * 				Palavra super
	� poss�vel chamar a implementa��o da superclasse usando a palavra super.
	
	@Override
	public void withdraw(double amount) {
	super.withdraw(amount);
	balance -= 2.0;
	
	}
		Classes e m�todos final
	� Palavra chave: final
	� Classe: evita que a classe seja herdada
	public final class SavingsAccount {
	� M�todo: evita que o m�todo sob seja sobreposto
	
	Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o
saque normalmente da superclasse, e descontar mais 2.0.
 */

public final class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number,holder,balance);
		this.interestRate = interestRate;
	}

	public SavingsAccount(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance +=balance + interestRate;
	}
	@Override
	public void withdraw(double amount) {
		balance-=amount;
	}

}
/*
 * Pra qu�?
	� Seguran�a: dependendo das regras do neg�cio, �s vezes � desej�vel
garantir que uma classe n�o seja herdada, ou que um m�todo n�o
seja sobreposto.
	� Geralmente conv�m acrescentar final em m�todos sobrepostos, pois
sobreposi��es m�ltiplas podem ser uma porta de entrada para
inconsist�ncias
	� Performance: atributos de tipo de uma classe final s�o analisados de
forma mais r�pida em tempo de execu��o.
	� Exemplo cl�ssico: String
	*/
