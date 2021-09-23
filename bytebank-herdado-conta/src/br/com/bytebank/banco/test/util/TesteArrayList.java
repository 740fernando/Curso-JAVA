package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

     //O ArrayList() ser� nosso guardador de refer�ncias, ao ser executado, internamente, 
	//ele utiliza um array com um n�mero pr�-determinado de posi��es, que gira em torno de 1000.
		ArrayList<Conta> lista= new ArrayList<Conta>();
		
		/*
		 * Estes s�mbolos que utilizamos (<>) se chamam generics. Temos uma classe, 
		 * ela � gen�rica, mas ao utiliz�-la, podemos tipificar o que ela conter�, 
		 * por exemplo, String:
		 */
		ArrayList<String> nomes = new ArrayList<String>();
		
	
				
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho = "+lista.size());//mostra quantas referencias foram armazenadas
		
		/*
		 * Podemos tamb�m criar um m�todo para que seja exibido um dos elementos do array. 
		 * Para isso, temos o get(index), onde podemos passar a posi��o desejada entre par�nteses (()).
		   Nosso retorno ser� do tipo Object, j� que temos um array de refer�ncias gen�ricas.
		 */
			
			Conta ref =  lista.get(0);// gerenerica para espcifica vai funcionar
			System.out.println(ref.getNumero());
			
			System.out.println("Ref = "+ref);
			lista.remove(0);

            System.out.println("Tamanho: " + lista.size());
            
            Conta cc3 = new ContaCorrente(33, 311);
            lista.add(cc3);

            Conta cc4 = new ContaCorrente(33, 322);
            lista.add(cc4);
            
            for(int i = 0; i < lista.size(); i++) {
                Object oRef = lista.get(i);
                System.out.println(oRef);
            }
            System.out.println("-------");
            for(Conta conta : lista) {
                System.out.println(conta);
            }
	}

}
