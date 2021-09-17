package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
 * 	Lista � uma estrutura de dados:
			� Homog�nea (dados do mesmo tipo)
			� Ordenada (elementos acessados por meio de posi��es)
			� Inicia vazia, e seus elementos s�o alocados sob demanda(diferente do vetor, que tem que instanciar ja com um valor)
			� Cada elemento ocupa um "n�" (ou nodo) da lista
			
			Tipo (interface): List
			� Classes que implementam: ArrayList, LinkedList, etc.
				� Vantagens:
					� Tamanho vari�vel
					� Facilidade para se realizar inser��es e dele��es
				� Desvantagens:
			        	� Acesso sequencial aos elementos *
 */

public class Program {
	public static void main(String[] args) {
		// o tipo list eh uma interface e nao pode ser instanciada, apenas referenciada
		List<String> list= new ArrayList<>();// CLASSE ARRAYLIST= implementacao otimizada do vetor e da lista
		
		list.add("Maria");// o m�todo add- adiciona uma informacao na lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");// Utilizado a sobrecarga de (posi�ao + elemento)
		
		System.out.println(list.size());//size- operacao que retorna o tamanho da list
	
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("================================================================");
		//list.remove("Anna");//remove- remove um elemento da lista
		//list.remove(1);// sobrecarga para remover como parametro a posicao da lista
		list.removeIf(x -> x.charAt(0)=='M');// funcao lambda -  pega o valor de x  e me retorna se x.charAt(0)(FUNCAO QUE PEGA A POSICAO DE UM ELEMENTO) eh igual a M
		System.out.println("Index of Bob : "+list.indexOf("Bob"));//retorna a posicao do elemento passsado no parametro, ou seja, 
		System.out.println("Index of Bob : "+list.indexOf("Marco"));// quando o Index nao encontra o elemento, ele retorna -1
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("================================================================");
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList()); 
		//stream(java 8 ou +) comando para acessar o objeto list e 
		// converter a informacoes para aceitar as expressoes lambda
		// filter- eh uma funcao que recebe um predicado e 
		// devolve a string filtrado conforme o predicado passado
		// collect(Collectors.toList()- converte de novo para lista
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("================================================================");
		String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
		//findFirst().orElse(null)- O findFirst � uma funcao que que pega o primeiro elemento de uma string
		// conforme o parametro passado, caso nao tenh, retorna nulo
		System.out.println(name);
		String name2 = list.stream().filter(x->x.charAt(0)=='J').findFirst().orElse(null);
		//findFirst().orElse(null)- O findFirst � uma funcao que que pega o primeiro elemento de uma string
		// conforme o parametro passado, caso nao tenh, retorna nulo
		System.out.println(name2);
	}
}
