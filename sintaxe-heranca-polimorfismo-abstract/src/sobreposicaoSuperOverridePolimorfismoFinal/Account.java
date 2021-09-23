package sobreposicaoSuperOverridePolimorfismoFinal;
/*
 * 		Polimorfismo
	Em Programa��o Orientada a Objetos, polimorfismo � recurso que
permite que vari�veis de um mesmo tipo mais gen�rico possam
apontar para objetos de tipos espec�ficos diferentes, tendo assim
comportamentos diferentes conforme cada tipo espec�fico.
 */
public class Account {

	private Integer number;
	private String holder;
	protected Double balance; // protected permite acesso por subclasse

	public Account() {

	}
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public void withdraw (double amount) {
		this.balance-=amount+5.0;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public Double getBalance() {
		return balance;
	}

}
