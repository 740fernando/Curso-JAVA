package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*Em programa��o, "vetor" � o nome dado a arranjos unidimensionais
	 *Arranjo (array) � uma estrutura de dados:
		� Homog�nea (dados do mesmo tipo)
		� Ordenada (elementos acessados por meio de posi��es)
		� Alocada de uma vez s�, em um bloco cont�guo de mem�ria 
		
	   	� Vantagens:
			� Acesso imediato aos elementos pela sua posi��o
		� Desvantagens:
			� Tamanho fixo
			� Dificuldade para se realizar inser��es e dele��es
			
			Fazer um programa para ler um n�mero inteiro N e a altura de N
	pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
	altura m�dia dessas pessoas.
	*/
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		double [] vet = new double[x];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i]=sc.nextDouble();
		}
		double soma=0;
		
		for (int i = 0; i < vet.length; i++) {
			soma+=vet[i];
		}
		double  media = soma/x;
		
		System.out.printf("A media eh : %.2f%n",media);
		sc.close();
	}
}

