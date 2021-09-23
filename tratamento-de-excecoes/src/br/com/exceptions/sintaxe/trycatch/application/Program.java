package br.com.exceptions.sintaxe.trycatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * � Uma exce��o � qualquer condi��o de erro ou comportamento
	inesperado encontrado por um programa em execu��o
	Em Java, uma exce��o � um objeto herdado da classe:
� java.lang.Exception - o compilador obriga a tratar ou propagar
� java.lang.RuntimeException - o compilador n�o obriga a tratar ou propagar
 * @author fsouviei
 *
 *Estrutura try-catch
	� Bloco try
	� Cont�m o c�digo que representa a execu��o normal do trecho de c�digo que
	pode acarretar em uma exce��o
	� Bloco catch
	� Cont�m o c�digo a ser executado caso uma exce��o ocorra
	� Deve ser especificado o tipo da exce��o a ser tratada (upcasting � permitido)
 */
public class Program {
	public static void main(String[] args) {

		method1();
		System.out.println("End Program");

	}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner (System.in);
		try {
			System.out.print("Digite 3 palavras : ");
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();// exibe a sequencia de chamadas que gerou a excessao
			sc.next();
		}catch(InputMismatchException e ) {
			System.out.println("Input Error");
		}
		System.out.println("***METHOD2 END***");
		sc.close();
	}

}
