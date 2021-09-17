package vetor;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		/* 
	Fazer um programa para ler um n�mero inteiro N e os dados (nome e
	pre�o) de N Produtos. Armazene os N produtos em um vetor. Em
	seguida, mostrar o pre�o m�dio dos produtos.
		 */	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product [] vet = new Product[n];
		
		
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();// A quebra de linha ficou pedente no nextInt acima
			System.out.print("Nome : " );
			String name = sc.nextLine();
			System.out.print("Preco : " );
			double price = sc.nextDouble();

			vet[i]= new Product(name, price);		
		}
		double soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i].getPrice();
			
		}
		double avg = soma / vet.length;
		System.out.println(" A media eh : "+avg);
		
		sc.close();
	}
}
