package classesabstratas;
/*
      Classes abstratas
� S�o classes que n�o podem ser instanciadas
� � uma forma de garantir heran�a total: somente subclasses n�o
abstratas podem ser instanciadas, mas nunca a superclasse abstrata
 */
public abstract class Account {

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
	public void withdraw (double amount) {
		this.balance-=amount;
	}
	public void deposit(double amount) {
		this.balance+=amount;
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


	public Double getBalance() {
		return balance;
	}


}
