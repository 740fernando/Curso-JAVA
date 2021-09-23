package heranca;
/*
 * 					Heran�a
		� � um tipo de associa��o que permite que uma classe herde todos dados e
	comportamentos de outra
		� Defini��es importantes
				� Rela��o "�-um"
				� Generaliza��o/especializa��o
				� Superclasse (classe base) / subclasse (classe derivada)
				� Heran�a / extens�o
				� Heran�a � uma associa��o entre classes (e n�o


		
		� Vantagens
		� Reuso
		� Polimorfismo
		� Sintaxe
		� class A extends B
 */
public class Program {
	
	public static void main(String[] args) {
//pq nao da erro quando uma superclasse recebe uma sub classe?
		// pq em herenca, aprendemos que uma relacao "� um", ou seja, um objeto da subclasse � da super classe
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		// UPCASTING
		Account acc1 = bacc;// objeto account recebe objeto business account 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		// DOWNCASTING
		if(acc2 instanceof BusinessAccount) {
			BusinessAccount acc4 = (BusinessAccount)acc2;
			System.out.println("acc2 instanceof BusinessAccount");
			acc4.loan(100.0);//foi possivel fazer o dowcast pq o acc4 eh uma referencia para businessaccount
		}
		// BusinessAccount acc5 = (BusinessAccount)acc3; //incompatibilidade de tipos. O compilador nao pode converter uma super para sub
		if (acc3 instanceof BusinessAccount) { //instanceof=  testa se o objeto � instancia de outro objeto	
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc5.loan(200.0);
		System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount)acc3;
		acc5.updateBalance();
		System.out.println("Update!");
		}
	}

}
