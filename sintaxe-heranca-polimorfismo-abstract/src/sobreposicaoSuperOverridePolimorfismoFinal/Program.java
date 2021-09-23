package sobreposicaoSuperOverridePolimorfismoFinal;
/*
 * Sobreposi��o ou sobrescrita

		� � a implementa��o de um m�todo de uma superclasse na subclasse

		� � fortemente recomend�vel usar a
		anota��o @Override em um m�todo sobrescrito

		� Facilita a leitura e compreens�o do
		c�digo

	    � Avisamos ao compilador (boa pr�tica)
 */

public class Program {
	/*
	 * Suponha que a opera��o de saque possui uma taxa no valor
	de 5.0. Entretanto, se a conta for do tipo poupan�a, esta taxa
	n�o deve ser cobrada. Como resolver isso?
	Resposta: sobrescrevendo o m�todo withdraw na subclasse
 SavingsAccount,
	 */
	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex",1000.0);		
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Bob",1000.0,500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		//INTRDOUCAO A POLIMORFIMOS
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);//Upcasting
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		/*
		 * Importante entender
			� A associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de
	execu��o (upcasting).
			� O compilador n�o sabe para qual tipo espec�fico a chamada do m�todo
	Withdraw est� sendo feita (ele s� sabe que s�o duas vari�veis tipo Account):
		 * 
		 */

		System.out.println("INTRDOUCAO A POLIMORFIMOS");
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		System.out.println("Podemos ter diferentes comportamentos"
				+ "\npara mesma operacao em objetos do mesmo tipo"
				+ "\nconforme os objetos nas quais elas apontam. ");
	}

}
